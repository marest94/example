package com.spring.app.soap.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.spring.app.soap.clients.Client;

public class AgreementClientConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.spring.app.soap.wsdl");
		return marshaller;
	}
	
	@Bean
	public Client agreementClient(Jaxb2Marshaller marshaller) {
		Client client = new Client();
		client.setDefaultUri("http://localhost:8080/soapws/agreements.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
