package com.zhangbaowei.controllers;

import com.zhangbaowei.testInterceptor.MyAnno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangbaowei
 * Create  on 2018/12/24 13:11.
 */

@RestController
public class MyController {

    @Autowired
    ServiceFunctionB serviceFunctionB;

    @MyAnno
    @GetMapping("/test/a")

    public String MyAction(String x, String y, Integer z) {
        return "In My Action";
    }


    @GetMapping("/test/b")
    public String bb() {
        serviceFunctionB.X(1);
        serviceFunctionB.Y(2);

        return "BBBB";
    }
}
