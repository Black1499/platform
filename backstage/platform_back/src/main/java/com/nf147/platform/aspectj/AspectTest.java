package com.nf147.platform.aspectj;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nf147.platform.entity.GeEnterprise;
import com.nf147.platform.entity.GeLogVisit;
import com.nf147.platform.service.impl.GeLogVisitServiceImpl;
import com.nf147.platform.util.response.JSONResponse;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author 张东明
 * @TODO: 2019/3/4
 * @remark AOP切面类 日志记录
 */
@Aspect
@Component
public class AspectTest {

    private final static Logger logger = LoggerFactory.getLogger(AspectTest.class);

    @Autowired
    private GeLogVisitServiceImpl geLogVisitService;

    @Pointcut("execution(public * com.nf147.platform.web..*.*(..))")
    public void controllerMethod() {

    }

    @Before("controllerMethod()")
    public void LogRequestInfo(JoinPoint joinPoint) throws JsonProcessingException {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        /**
         * 获取Session
         * */
        GeEnterprise user = null;// (GeEnterprise) request.getSession().getAttribute("user");

        int id = 0;
        if (user != null) {
            id = user.getId();
        }
        String remoteAddr = request.getRemoteAddr();
        String requestURI = request.getRequestURI();

        if (remoteAddr != null && requestURI != null) {
            GeLogVisit geLogVisit = null;
            if (id > 0) {
                geLogVisit = new GeLogVisit(id, remoteAddr, requestURI, new Date(), 1);
            } else {
                geLogVisit = new GeLogVisit(remoteAddr, requestURI, new Date(), 1);
            }
            System.out.println("日志记录信息：" + geLogVisit.toString());
            int insert = geLogVisitService.insert(geLogVisit);
            System.out.println(insert);
        }

        StringBuffer requestLog = new StringBuffer();
        requestLog.append("请求信息：")
                .append("URL = {" + requestURI + "},\t")
                .append("HTTP_METHOD = {" + request.getMethod() + "},\t")
                .append("IP = {" + remoteAddr + "},\t")
                .append("CLASS_METHOD = {" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName() + "},\t");

        if (joinPoint.getArgs().length == 0) {
            requestLog.append("ARGS = {} ");
        } else {
            requestLog.append("ARGS = " + new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
                    .writeValueAsString(joinPoint.getArgs()[0]) + "");
        }
        System.out.println(requestLog.toString());
    }

    /**
     * @remark 调用之后回归返回结果
     * // TODO: 2019/3/4
     */
    @AfterReturning(returning = "resultVO", pointcut = "controllerMethod()")
    public void logResultVOInfo(JSONResponse resultVO) throws Exception {
        System.out.println("请求结果：" + resultVO.getCode() + "\t" + resultVO.getData());
    }

}
