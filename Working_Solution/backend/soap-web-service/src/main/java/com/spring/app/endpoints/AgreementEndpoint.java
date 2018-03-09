package com.spring.app.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.spring.app.repositories.AgreementRepository;
import localhost._8080.soap.GetAgreementsRequest;
import localhost._8080.soap.GetAgreementsResponse;

@Endpoint
public class AgreementEndpoint {
	private static final String NAMESPACE_URI = "http://localhost:8080/soap";
	
	@Autowired
	private AgreementRepository agreementRepository;	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAgreementsRequest")
	@ResponsePayload
	public GetAgreementsResponse getAgrement(@RequestPayload GetAgreementsRequest request) {
		GetAgreementsResponse response = new GetAgreementsResponse();
		response.setAgreement(agreementRepository.getAgreement(request.getAgreementID()));
		
		return response;
	}
	
	
	
}