package com.spring.app.rest.services;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.spring.app.rest.services.interfaces.IService1ClientService;
import com.spring.app.soap.clients.Client;
import com.spring.app.soap.configs.Service1ClientConfig;

import com.spring.app.soap.wsdl.Service1;
@Service
public class Service1ClientImpl implements IService1ClientService {

	@Override
	public Service1 getService1ByID(int id) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(Service1ClientConfig.class);
	    ctx.refresh();
		Client response = ctx.getBean(Client.class);
		response.getAgreementById(id);
		Service1 a = response.getServiceById(id).getService1();
		ctx.close(); //NOTE: DELETE ME IF IT DOESN'T WORK!
		return a;
	}

}
