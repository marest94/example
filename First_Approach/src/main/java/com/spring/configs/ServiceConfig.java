package com.spring.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.spring.services", "com.spring.services.interfaces" })
public class ServiceConfig {

}