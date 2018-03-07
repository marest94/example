package com.spring.services;

import java.io.StringWriter;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.spring.services.interfaces.ISOAPService;

public class SOAPService implements ISOAPService {

	@Override
	public JSONObject getAllData(NodeList nodeList, String tagName) throws TransformerConfigurationException,
	TransformerException, TransformerFactoryConfigurationError, JSONException {
		JSONObject resultObject = new JSONObject();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (!node.getNodeName().equals(tagName) && node.hasChildNodes()) {
				return getAllData(node.getChildNodes(), tagName);
			} else if (node.getNodeName().equals(tagName)) {
				DOMSource source = new DOMSource(node);
				StringWriter stringResult = new StringWriter();
				TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(stringResult));
				resultObject = XML.toJSONObject(stringResult.toString()).optJSONObject(tagName);
			}
		}
		return resultObject;
	}

	@Override
	public JSONObject getObjectData(String tagName, SOAPMessage message) throws Exception {
		NodeList nodeList = message.getSOAPBody().getChildNodes();
		JSONObject resultObject = getAllData(nodeList, tagName);
		return resultObject;
	}

	
	
	
}
