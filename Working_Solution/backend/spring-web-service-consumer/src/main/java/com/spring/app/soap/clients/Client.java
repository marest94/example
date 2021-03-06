package com.spring.app.soap.clients;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.spring.app.soap.wsdl.GetAgreementsRequest;
import com.spring.app.soap.wsdl.GetAgreementsResponse;
import com.spring.app.soap.wsdl.GetService1Request;
import com.spring.app.soap.wsdl.GetService1Response;
import com.spring.app.soap.wsdl.GetUserRequest;
import com.spring.app.soap.wsdl.GetUserResponse;

public class Client extends WebServiceGatewaySupport  {
	public GetUserResponse getUserById(int userID) {
		GetUserRequest request = new GetUserRequest();
		request.setUserID(userID);
		GetUserResponse response = (GetUserResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://localhost:8080/soapws/getUserResponse"));
		return response;
	}
	
	public GetAgreementsResponse getAgreementById(int agreementID) {
		GetAgreementsRequest request = new GetAgreementsRequest();
		request.setAgreementID(agreementID);
		GetAgreementsResponse response = (GetAgreementsResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://localhost:8080/soapws/getAgreementsResponse"));
		return response;
	}

	public GetService1Response getServiceById(int serviceID) {
		GetService1Request request = new GetService1Request();
		request.setService1ID(serviceID);
		GetService1Response response = (GetService1Response) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://localhost:8080/soapws/getService1Response"));
		return response;
	}
	
	
} 