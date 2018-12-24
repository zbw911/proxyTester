package com.zhangbaowei.testInterceptor;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.AdviceModeImportSelector;
import org.springframework.context.annotation.AutoProxyRegistrar;

public class TestConfigurationSelector extends AdviceModeImportSelector<EableTest> {

    @Override
    public String[] selectImports(AdviceMode adviceMode) {
        switch (adviceMode) {
            case PROXY:
                return new String[]{AutoProxyRegistrar.class.getName(), ControllerMethodInterceptor.class.getName(), ProxyMyTestConfiguration.class.getName()};
            case ASPECTJ:
                // return new String[]{AnnotationConfigUtils.CACHE_ASPECT_CONFIGURATION_CLASS_NAME};
            default:
                return null;
        }
    }

}