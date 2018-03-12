package com.spring.app.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.spring.app.repositories.AgreementRepository;
import com.spring.app.repositories.Service1Repository;

import localhost._8080.soap.GetAgreementsRequest;
import localhost._8080.soap.GetAgreementsResponse;
import localhost._8080.soap.GetService1Request;
import localhost._8080.soap.GetService1Response;

@Endpoint
public class Service1Endpoint {
	private static final String NAMESPACE_URI = "http://localhost:8080/soap";
	
	@Autowired
	private Service1Repository service1Repository;	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getService1Request")
	@ResponsePayload
	public GetService1Response getService1(@RequestPayload GetService1Request request) {
		GetService1Response response = new GetService1Response();
		response.setService1(service1Repository.getService1((request.getService1ID())));
		
		return response;
	}
	
	
	
}