package com.nf147.platform.web;

import com.nf147.platform.entity.GeUser;
import com.nf147.platform.service.GeUserService;
import com.nf147.platform.shiro.JwtUtils;
import com.nf147.platform.util.response.Constants;
import com.nf147.platform.util.response.JSONResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 陈卓悦
 */
@RestController
public class GeUserController {
    @Autowired
    private GeUserService geUserService;

    /**
     * 用户名密码登录
     * @param request
     * @return token
     */
    @PostMapping(value = "/login")
    public JSONResponse login(@RequestBody GeUser loginInfo, HttpServletRequest request, HttpServletResponse response){
        Subject subject = SecurityUtils.getSubject();
        try {
            GeUser u = geUserService.selectByNumber(loginInfo.getNumber());
            String password = new Sha256Hash(loginInfo.getPassword(), ByteSource.Util.bytes(loginInfo.getNumber()) ).toHex();
            UsernamePasswordToken token = new UsernamePasswordToken(loginInfo.getNumber(),loginInfo.getPassword());
            subject.login(token);
            GeUser user = (GeUser) subject.getPrincipal();
            geUserService.updateByPrimaryKey(user);
            String newToken = geUserService.generateJwtToken(user.getNumber());
            response.setHeader("Authorization", newToken);
            return JSONResponse.OK(Constants.SUCCESS_200);
        } catch (AuthenticationException e) {
            return JSONResponse.ERROR(Constants.ERROR_401);
        } catch (Exception e) {
            return JSONResponse.ERROR(Constants.ERROR_500);
        }
    }

    @GetMapping(value = "/logout")
    public JSONResponse logout() {
        Subject subject = SecurityUtils.getSubject();
        if(subject.getPrincipals() != null) {
            GeUser user = (GeUser)subject.getPrincipals().getPrimaryPrincipal();
        }
        SecurityUtils.getSubject().logout();
        return JSONResponse.OK(Constants.SUCCESS_200);
    }

    @GetMapping(value = "/selectToken")
    public JSONResponse selectToken(String token,HttpServletResponse response,HttpServletRequest requests){
        try{
            if(JwtUtils.getNumber(token) == null){
                return JSONResponse.ERROR(Constants.ERROR_401);
            }
            if(JwtUtils.isTokenExpired(token)){
                return JSONResponse.ERROR(Constants.ERROR_401);
            }
        }catch (Exception e){
            e.printStackTrace();
            return JSONResponse.ERROR(Constants.ERROR_500);
        }
        GeUser user = geUserService.selectByNumber(JwtUtils.getNumber(token));
        return JSONResponse.OK(Constants.SUCCESS_200,user);
    }



}
