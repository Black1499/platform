package com.nf147.platform.exception;

import com.nf147.platform.util.response.Constants;
import com.nf147.platform.util.response.JSONResponse;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 陈卓悦
 * @description: 统一异常拦截
 */
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());


    /**
     * GET/POST请求方法错误的拦截器
     * 因为开发时可能比较常见,而且发生在进入controller之前,上面的拦截器拦截不到这个错误
     * 所以定义了这个拦截器
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public JSONResponse httpRequestMethodHandler() {
        return JSONResponse.ERROR(Constants.ERROR_415);
    }


    /**
     * 权限不足报错拦截
     */
    @ExceptionHandler(UnauthorizedException.class)
    public JSONResponse unauthorizedExceptionHandler() {
        return JSONResponse.ERROR(Constants.ERROR_420);
    }

    /**
     * 未登录报错拦截
     * 在请求需要权限的接口,而连登录都还没登录的时候,会报此错
     */
    @ExceptionHandler(AuthenticationException.class)
    public JSONResponse authenticationException() {
        return JSONResponse.ERROR(Constants.ERROR_401);
    }

}
