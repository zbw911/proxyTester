package com.zhangbaowei.dynprox.jdkproxy;

import org.junit.Test;

/**
 * Create by  zhangbaowei on 2018/9/7 13:20.
 */
public class MyInvocationHandlerTest {

    @Test
    public void TE() {

        System.out.println(int.class.equals(Integer.class));
        System.out.println(int.class.equals(int.class));
//        System.out.println(int.class Integer));
        Class<? extends MyInvocationHandlerTest> aClass = this.getClass();


    }
}