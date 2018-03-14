package com.spring.app.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.spring.app.repositories.UserRepository;

import localhost._8080.soap.GetUserListResponse;
import localhost._8080.soap.GetUserRequest;
import localhost._8080.soap.GetUserResponse;

@Endpoint
public class UserEndpoint {
	private static final String NAMESPACE_URI = "http://localhost:8080/soap";

	@Autowired
	private UserRepository userRepository;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")
	@ResponsePayload
	public GetUserResponse getUser(@RequestPayload GetUserRequest request) {
		GetUserResponse response = new GetUserResponse();
		response.setUser(userRepository.getUser(request.getUserID()));

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserListRequest")
	@ResponsePayload
	public GetUserListResponse getUserList(@RequestPayload GetUserRequest request) {
		GetUserListResponse response = new GetUserListResponse();
		response.getUserList().setUser(userRepository.getUserList());
		return response;
	}
	
}