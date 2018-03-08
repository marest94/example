package com.spring.app.soap.clients;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.spring.app.soap.wsdl.GetUserRequest;
import com.spring.app.soap.wsdl.GetUserResponse;

public class UserClient extends WebServiceGatewaySupport  {
	public GetUserResponse getUserById(int userID) {
		GetUserRequest request = new GetUserRequest();
		request.setUserID(userID);
		GetUserResponse response = (GetUserResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://localhost:8080/soapws/getUserResponse"));
		return response;
	}
} 