package com.zhangbaowei.testInterceptor;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.context.annotation.Role;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhangbaowei
 */

@Configuration
public class ProxyMyTestConfiguration implements ImportAware {


    private AnnotationMetadata importMetadata;

    @Bean(name = "org.zhangbaowei.test.mytest.beanFactoryMyTestOperationSourceAdvisor")
    @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
    public BeanFactoryMyTestOperationSourceAdvisor beanFactoryMyTestOperationSourceAdvisor() {
        BeanFactoryMyTestOperationSourceAdvisor advisor = new BeanFactoryMyTestOperationSourceAdvisor();
        advisor.setAdvice(controllerMethodInterceptor());
        return advisor;
    }


    @Bean
    @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
    public ControllerMethodInterceptor controllerMethodInterceptor() {
        ControllerMethodInterceptor controllerMethodInterceptor = new ControllerMethodInterceptor();
        return controllerMethodInterceptor;
    }


    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        this.importMetadata = importMetadata;
    }
}