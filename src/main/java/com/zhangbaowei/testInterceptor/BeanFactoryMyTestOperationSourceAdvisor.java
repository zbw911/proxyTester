package com.zhangbaowei.testInterceptor;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

public class BeanFactoryMyTestOperationSourceAdvisor extends AbstractBeanFactoryPointcutAdvisor {


    @Override
    public Pointcut getPointcut() {
//        return null;

        return new MyOperationSourcePointcut();
    }
}
