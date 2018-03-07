package com.spring.controllers;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.connection.SoapServerConnection;
import com.spring.services.SOAPService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FrontController {

	@Autowired
	SOAPService soapService;
	
	@RequestMapping(path = "/user", method = RequestMethod.GET)
	public JSONObject sendToFront() throws Exception {

		final String test = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><getUserFromServiceResponse xmlns=\"http://localhost:9000\"><getUserFromServiceResult><NewDataSet xmlns=\"\"><users><users><id>6</id><lastName>Hillitt</lastName><name>Donelle</name><yearOfBirth>2007</yearOfBirth></users><users><id>9</id><lastName>Yard</lastName><name>Tracy</name><yearOfBirth>1995</yearOfBirth></users></users></NewDataSet></getUserFromServiceResult></getUserFromServiceResponse></soap:Body></soap:Envelope>";
		InputStream is = new ByteArrayInputStream(test.getBytes());
		SOAPMessage soapMessage = MessageFactory.newInstance().createMessage(null, is);
		return soapService.getObjectData("User", soapMessage);
	}
	
}
