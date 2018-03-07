package com.spring.controllers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.zip.InflaterInputStream;

import javax.xml.soap.MessageFactory;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SOAPclass {
	public static int PRETTY_PRINT_INDENT_FACTOR = 5;
	public static String TEST_XML_STRING = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><getUserFromServiceResponse xmlns=\"http://localhost:9000\"><getUserFromServiceResult><NewDataSet xmlns=\"\"><User><name>Vlajko</name><lastName>Vlajkovic</lastName><phone>0603112899</phone></User></NewDataSet></getUserFromServiceResult></getUserFromServiceResponse></soap:Body></soap:Envelope>";

	private static JSONObject extractData(NodeList nodeList, String tagName) throws TransformerConfigurationException,
			TransformerException, TransformerFactoryConfigurationError, JSONException {
		JSONObject resultObject = new JSONObject();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (!node.getNodeName().equals(tagName) && node.hasChildNodes()) {
				return extractData(node.getChildNodes(), tagName);
			} else if (node.getNodeName().equals(tagName)) {
				DOMSource source = new DOMSource(node);
				StringWriter stringResult = new StringWriter();
				TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(stringResult));
				resultObject = XML.toJSONObject(stringResult.toString()).optJSONObject(tagName);
			}
		}
		return resultObject;
	}

	public static JSONObject getFullData(String tagName, SOAPMessage message) throws Exception {
		NodeList nodeList = message.getSOAPBody().getChildNodes();
		JSONObject resultObject = extractData(nodeList, tagName);
		return resultObject;
	}

	public static void jsonConvert() {
		try {
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
	}
	public static void main(String[] args) throws Exception {
		final String test = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><getUserFromServiceResponse xmlns=\"http://localhost:9000\"><getUserFromServiceResult><NewDataSet xmlns=\"\"><User><name>Vlajko</name><lastName>Vlajkovic</lastName><phone>0603112899</phone></User></NewDataSet></getUserFromServiceResult></getUserFromServiceResponse></soap:Body></soap:Envelope>";
		InputStream is = new ByteArrayInputStream(test.getBytes());
		SOAPMessage msg = MessageFactory.newInstance().createMessage(null, is);
		jsonConvert();
		System.out.println(getFullData("User", msg));
	}

}
