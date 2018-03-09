package com.spring.app.rest.services;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.spring.app.rest.services.interfaces.IUserClientService;
import com.spring.app.soap.clients.Client;
import com.spring.app.soap.configs.UserClientConfig;
import com.spring.app.soap.wsdl.User;

@Service
public class UserClientServiceImpl implements IUserClientService {

	/* Overrided method from IUserClientService with implementation for getting user from server*/
	@Override
	public User getUserById(int id) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(UserClientConfig.class);
        ctx.refresh();
		Client response = ctx.getBean(Client.class);
		response.getUserById(id);
		User u = response.getUserById(id).getUser();
		ctx.close(); //NOTE: DELETE ME IF IT DOESN'T WORK!
		return u;
	}
}
