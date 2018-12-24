package com.zhangbaowei.testInterceptor;

import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.core.annotation.AnnotationUtils;

import java.io.Serializable;
import java.lang.reflect.Method;

public class MyOperationSourcePointcut extends StaticMethodMatcherPointcut implements Serializable {


    @Override
    public boolean matches(Method method, Class<?> targetClass) {

        MyAnno annotation = AnnotationUtils.getAnnotation(method, MyAnno.class);

        if (annotation != null) {
            return true;
        }

        annotation = AnnotationUtils.getAnnotation(method.getDeclaringClass(), MyAnno.class);

        if (annotation != null) {
            return true;
        }

        return false;

    }
}