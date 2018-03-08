package com.spring.app.rest.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*Configuration for scanning controllers package*/

@Configuration
@ComponentScan(basePackages = "com.spring.app.rest.controllers")
public class ControllerConfig {
	
}
