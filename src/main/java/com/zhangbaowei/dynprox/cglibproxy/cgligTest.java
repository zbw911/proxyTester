package com.zhangbaowei.dynprox.cglibproxy;

import com.zhangbaowei.classinterfaces.UserService;
import com.zhangbaowei.classinterfaces.UserServiceImpl;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * Create by  zhangbaowei on 2018/9/6 17:16.
 */
public class cgligTest {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "./");

        CglibProxy cp = new CglibProxy();
        UserService proxy = (UserService) cp.getProxy(UserServiceImpl.class);
        proxy.add();

        proxy.toString();
    }
}
