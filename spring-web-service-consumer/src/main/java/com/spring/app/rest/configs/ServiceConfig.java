package com.spring.app.rest.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spring.app.rest.services", "com.spring.app.rest.services.interfaces"})
public class ServiceConfig {

}
