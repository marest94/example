package com.spring.app.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
@ComponentScan("com.spring.app") 
public class Servis1Config extends WsConfigurerAdapter {
	@Bean(name = "service1")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema service1Schema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("Service1Port");
		wsdl11Definition.setLocationUri("/soapws");
		wsdl11Definition.setTargetNamespace("http://localhost:8080/soap");
		wsdl11Definition.setSchema(service1Schema);
		
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema service1Schema() {
		return new SimpleXsdSchema(new ClassPathResource("service1.xsd"));
	}
} 