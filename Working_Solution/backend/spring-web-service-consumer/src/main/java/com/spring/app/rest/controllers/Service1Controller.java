package com.spring.app.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.rest.services.interfaces.IService1ClientService;
import com.spring.app.soap.wsdl.Agreement;
import com.spring.app.soap.wsdl.Service1;

@RestController
@CrossOrigin
public class Service1Controller {

	@Autowired
	
	IService1ClientService clientService;
	
	


	@RequestMapping("/service1")
	public List<Service1> getById() {
		Service1 a1 = clientService.getService1ByID(1);
		Service1 a2 = clientService.getService1ByID(2);
		Service1 a3 = clientService.getService1ByID(3);
		
		List<Service1> services1 = new ArrayList<Service1>();
		services1.add(a1);
		services1.add(a2);
		services1.add(a3);
		
		return services1;
	}
}
