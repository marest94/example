package com.spring.app.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
@ComponentScan("com.spring.app") 
public class UserListConfig {
	
	@Bean(name = "usersList")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema usersListSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("UsersListPort");
		wsdl11Definition.setLocationUri("/soapws");
		wsdl11Definition.setTargetNamespace("http://localhost:8080/soap");
		wsdl11Definition.setSchema(usersListSchema);
		
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema usersListSchema() {
		return new SimpleXsdSchema(new ClassPathResource("userList.xsd"));
	}

}
