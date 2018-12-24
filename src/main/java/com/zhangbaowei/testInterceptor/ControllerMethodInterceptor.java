package com.zhangbaowei.testInterceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 方法拦截器，拦截Controller中的方法，记录log
 */
public class ControllerMethodInterceptor implements MethodInterceptor {
    private final static ObjectMapper jsonMapper = new ObjectMapper();
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        logger.info("Before: interceptor name: {}", invocation.getMethod().getName());

        logger.info("Arguments: {}", jsonMapper.writeValueAsString(invocation.getArguments()));

        Object result = invocation.proceed();

        logger.info("After: result: {}", jsonMapper.writeValueAsString(result));

        return result;
    }

}
