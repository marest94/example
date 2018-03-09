package com.spring.app.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.rest.services.interfaces.IAgreementClientService;
import com.spring.app.soap.wsdl.Agreement;
import com.spring.app.soap.wsdl.User;

@RestController
@RequestMapping("/agreements")
@CrossOrigin()
public class AgreementController {
	
	@Autowired
	IAgreementClientService agreementService;

	@RequestMapping("/all")
	public List<Agreement> getById() {
		Agreement a1 = agreementService.getAgreementById(1);
		Agreement a2 = agreementService.getAgreementById(2);
		Agreement a3 = agreementService.getAgreementById(3);
		
		List<Agreement> agreements = new ArrayList<Agreement>();
		agreements.add(a1);
		agreements.add(a2);
		agreements.add(a3);
		
		return agreements;
	}
}
