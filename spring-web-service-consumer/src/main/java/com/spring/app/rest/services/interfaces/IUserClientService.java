package com.spring.app.rest.services.interfaces;

import com.spring.app.soap.wsdl.User;

public interface IUserClientService {
	User getUserById(int id);
}
