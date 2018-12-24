package com.zhangbaowei.controllers;

import org.springframework.stereotype.Service;

/**
 * @author zhangbaowei
 * Create  on 2018/12/24 14:05.
 */
@Service
public class ServiceFunctionA {


    public void X(int a) {
        System.out.println("in  ServiceFunctionA -> X");
        return;
    }


    public int Y(int y) {
        System.out.println("in  ServiceFunctionA -> Y");
        return y;
    }

}
