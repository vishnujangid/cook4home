package com.cook4home.configuration;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfig {
    
    @Bean
    Mapper mapper() {
        return new DozerBeanMapper();
    }
    
}