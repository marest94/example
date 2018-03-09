package com.spring.app.soap.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.spring.app.soap.clients.Client;

@Configuration
public class UserClientConfig {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.spring.app.soap.wsdl");
		return marshaller;
	}
	
	@Bean
	public Client userClient(Jaxb2Marshaller marshaller) {
		Client client = new Client();
		client.setDefaultUri("http://localhost:8080/soapws/users.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
} 