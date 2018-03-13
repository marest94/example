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
public class AgreementsListConfig {
	@Bean(name = "agreementsList")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema agreementsListSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("AgreementsListPort");
		wsdl11Definition.setLocationUri("/soapws");
		wsdl11Definition.setTargetNamespace("http://localhost:8080/soap");
		wsdl11Definition.setSchema(agreementsListSchema);
		
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema agreementsListSchema() {
		return new SimpleXsdSchema(new ClassPathResource("agreementsList.xsd"));
	}

}
