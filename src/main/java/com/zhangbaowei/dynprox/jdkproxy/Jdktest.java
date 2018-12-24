package com.zhangbaowei.dynprox.jdkproxy;

import com.zhangbaowei.classinterfaces.UserService;

import java.io.IOException;

/**
 * Create by  zhangbaowei on 2018/9/6 17:10.
 */
public class Jdktest {
    public static void main(String[] args) throws IOException {

        //生成的代理类保存到磁盘
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        MyInvocationHandler handler = new MyInvocationHandler(UserService.class);
        UserService proxy = (UserService) handler.getProxy();
        proxy.add();
        int count = proxy.count(1);

//        System.in.read();
    }
}
