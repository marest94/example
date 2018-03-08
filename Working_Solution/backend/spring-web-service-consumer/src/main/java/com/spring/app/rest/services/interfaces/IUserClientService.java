package com.spring.app.rest.services.interfaces;

import javax.servlet.http.HttpServletResponse;

import com.spring.app.soap.wsdl.User;

public interface IUserClientService {
	
	/* Method for getting user from server*/
	User getUserById(int id);
}
