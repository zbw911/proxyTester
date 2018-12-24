package com.zhangbaowei.dynprox.cglibproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {

        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        //enhancer.setCallbackType(clazz);;
        return enhancer.create();
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        System.out.println("-----------------begin " + method.getName() + "-----------------");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("-----------------end " + method.getName() + "-----------------");

        return result;
    }
}