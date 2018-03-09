package com.spring.app.rest.services;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.spring.app.rest.services.interfaces.IAgreementClientService;
import com.spring.app.soap.clients.Client;
import com.spring.app.soap.configs.AgreementClientConfig;
import com.spring.app.soap.wsdl.Agreement;

@Service
public class AgreementClientServiceImpl implements IAgreementClientService{

	@Override
	public Agreement getAgreementById(int id) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(AgreementClientConfig.class);
	    ctx.refresh();
		Client response = ctx.getBean(Client.class);
		response.getAgreementById(id);
		Agreement a = response.getAgreementById(id).getAgreement();
		ctx.close(); //NOTE: DELETE ME IF IT DOESN'T WORK!
		return a;
	}
}
