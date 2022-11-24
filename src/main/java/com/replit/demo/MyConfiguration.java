package com.replit.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class MyConfiguration {
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}