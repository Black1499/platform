package com.nf147.platform.shiro.realm;

import com.nf147.platform.entity.GeUser;
import com.nf147.platform.service.GeUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Collection;
import java.util.List;

/**
 * @author 陈卓悦
 */
public class DbShiroRealm extends AuthorizingRealm {
	private final Logger log = LoggerFactory.getLogger(DbShiroRealm.class);

	@Autowired
	private GeUserService geUserService;
	
	public DbShiroRealm() {
		this.setCredentialsMatcher(new HashedCredentialsMatcher(Sha256Hash.ALGORITHM_NAME));
	}


	@Override
	public boolean supports(AuthenticationToken token) {
		return token instanceof UsernamePasswordToken;
	}

	/**
	 * 获取认证信息根据token
	 * 这一步我们根据token给的用户名，去数据库查出加密过的用户密码，然后把加密后的密码和salt值一起发给shiro，让它做比对
	 * @param token
	 * @return
	 * @throws AuthenticationException
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken userpasswordToken = (UsernamePasswordToken)token;
		String username = userpasswordToken.getUsername();
		GeUser user = geUserService.selectByNumber(username);
		if(user == null) {
			throw new AuthenticationException("用户名或者密码错误");
		}
		if(user.getStatus().equals("禁用")| user.getStatus().equals("未激活")){
			throw new AuthenticationException("用户禁用或未激活");
		}

		return new SimpleAuthenticationInfo(user, user.getPassword(),ByteSource.Util.bytes(user.getNumber()), "dbRealm");
	}

	/**
	 * 获取认证信息根据PrincipalCollection，这是一个身份集合
	 * @param principals
	 * @return
	 */

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {      
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        GeUser user = (GeUser) principals.getPrimaryPrincipal();
		List<String>  role = geUserService.getUserRole(user.getId());
        if (role != null) {
			simpleAuthorizationInfo.addRoles(role);
		}
        return simpleAuthorizationInfo;
	}
}
