package com.zhangbaowei.dynprox.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author zhangbaowei
 */
public class MyInvocationHandler implements InvocationHandler {

    private Class<?> target;

    public MyInvocationHandler(Class<?> target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("-----------------begin " + method.getName() + "-----------------");

        System.out.println("可以在这里执行业务逻辑跟");

        System.out.println("-----------------end " + method.getName() + "-----------------");

        Class<?> returnType = method.getReturnType();

        Class<?>[] classes = {byte.class, short.class, int.class, long.class, float.class};

        if (0 < Arrays.stream(classes).filter(x -> x.equals(returnType)).count()) {
            return 0;
        }
        if (boolean.class.equals(returnType.getClass())) {
            return false;
        }

        if (char.class.equals(returnType.getClass())) {
            return '\u0000';
        }

        return null;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{target},
                this);
    }

}