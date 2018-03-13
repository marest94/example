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
public class UserConfig extends WsConfigurerAdapter {
	@Bean(name = "users")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema usersSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("UsersPort");
		wsdl11Definition.setLocationUri("/soapws");
		wsdl11Definition.setTargetNamespace("http://localhost:8080/soap");
		wsdl11Definition.setSchema(usersSchema);
		
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema usersSchema() {
		return new SimpleXsdSchema(new ClassPathResource("users.xsd"));
	}
	
	
} 

/*
The configuration class should be annotated with @EnableWs that will provide web service configuration. We need to override 
WsConfigurerAdapter to get required WsConfigurer methods. The bean name for DefaultWsdl11Definition is must because this bean 
name will be the part of WSDL URL as students.wsdl. 

@EnableWs : Provides spring web service configuration. 
WsConfigurerAdapter : This class is an adapter class that contains only required methods of WsConfigurer. 
DefaultWsdl11Definition : Creates SOAP for the given XSD schema. 
XsdSchema : Abstraction for XSD schema. 
*/