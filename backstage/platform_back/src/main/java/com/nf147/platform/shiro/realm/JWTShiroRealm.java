package com.nf147.platform.shiro.realm;

import com.nf147.platform.entity.GePermission;
import com.nf147.platform.entity.GeUser;
import com.nf147.platform.service.GeUserService;
import com.nf147.platform.shiro.JWTCredentialsMatcher;
import com.nf147.platform.shiro.JWTToken;
import com.nf147.platform.shiro.JwtUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;




/**
 * @author 陈卓悦
 */
public class JWTShiroRealm extends AuthorizingRealm {
	private final Logger log = LoggerFactory.getLogger(JWTShiroRealm.class);
	
    @Autowired
    protected GeUserService geUserService;

    public JWTShiroRealm(){
        this.setCredentialsMatcher(new JWTCredentialsMatcher());
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    /**
     * 认证信息.(身份验证) : Authentication 是用来验证用户身份
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     * 跟controller登录一样，也是获取用户的salt值，给到shiro，由shiro来调用matcher来做认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authToken) throws AuthenticationException {
        JWTToken jwtToken = (JWTToken) authToken;
        String token = jwtToken.getToken();
        GeUser user = geUserService.selectByNumber(JwtUtils.getNumber(token));
        if(user == null) {
            throw new AuthenticationException();
        }

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, ByteSource.Util.bytes(user.getNumber()), "jwtRealm");
        return authenticationInfo;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Subject subject = SecurityUtils.getSubject();
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        GeUser u = (GeUser) subject.getPrincipal();
        List<String> list = new ArrayList<>();
        for (GePermission permission : u.getRole().getPermissionList()) {
            list.add(permission.getWildcard());
        }
        simpleAuthorizationInfo.addStringPermissions(list);
        return simpleAuthorizationInfo;
    }
}
