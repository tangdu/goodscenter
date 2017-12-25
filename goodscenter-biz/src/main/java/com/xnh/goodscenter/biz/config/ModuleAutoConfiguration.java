package com.xnh.goodscenter.biz.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@ComponentScan(
        basePackages = {
        "com.xnh.goodscenter.biz.facade",
         "com.xnh.goodscenter.biz.service"
        }
)
public class ModuleAutoConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(ModuleAutoConfiguration.class);

    @PostConstruct
    public void initCxf() {
        LOGGER.info("biz_module_init......");
    }
}
