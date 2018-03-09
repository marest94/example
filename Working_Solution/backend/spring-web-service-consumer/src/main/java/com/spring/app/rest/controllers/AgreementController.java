package com.spring.app.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	private List<Agreement> agreements = new ArrayList<Agreement>();


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
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String add(@RequestBody Agreement a) {
	    agreements.add(a);  // users list must be added like a property to the controller class, it cant be seen from the controller upper (getUsers controller)
	    return "redirect:all";
	}
	
	/* NOTE: Not implemented yet in anagular@!!
	@RequestMapping("/remove/{id}")
	public String remove(@PathVariable int id) {
		Agreement a = agreementService.getAgreementById(id);
		
		agreements.remove(a);
		
		return "redirect:all";
	} */
	
}
