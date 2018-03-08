package com.spring.services.interfaces;

import javax.xml.soap.SOAPMessage;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.NodeList;

public interface ISOAPService {

	JSONObject getAllData(NodeList nodeList, String tagName) throws TransformerConfigurationException,
	TransformerException, TransformerFactoryConfigurationError, JSONException;
	JSONObject getObjectData(String tagName, SOAPMessage message) throws Exception;
	
	
} 
