package com.zhangbaowei;

import com.zhangbaowei.testInterceptor.EableTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangbaowei
 * Create  on 2018/12/24 11:50.
 */
@EableTest
@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
