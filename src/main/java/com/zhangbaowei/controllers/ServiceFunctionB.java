package com.zhangbaowei.controllers;

import com.zhangbaowei.testInterceptor.MyAnno;
import org.springframework.stereotype.Service;

/**
 * @author zhangbaowei
 * Create  on 2018/12/24 14:05.
 */

@Service
@MyAnno
public class ServiceFunctionB {

    @MyAnno
    public void X(int a) {
        System.out.println("in  ServiceFunctionB -> X");
        return;
    }


    public int Y(int y) {
        System.out.println("in  ServiceFunctionB -> Y");
        return y;
    }
}
