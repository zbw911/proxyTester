package com.zhangbaowei.testInterceptor;

import java.lang.annotation.*;

/**
 * @author zhangbaowei
 * Create  on 2018/12/24 12:59.
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnno {
}
