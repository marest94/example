package com.spring.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.connection.SoapServerConnection;
import com.spring.services.SOAPService;

public class FrontController {

	@Autowired
	SOAPService soapService;
	
	@Autowired
	
	SoapServerConnection connection;
	
	@RequestMapping("/user")
	public JSONObject sendToFront() throws Exception {
		return soapService.getObjectData("User", connection.createTestSoapRequest());
	}
	
}
