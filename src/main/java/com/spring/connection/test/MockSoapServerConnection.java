package com.spring.connection.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.json.JSONObject;

public class MockSoapServerConnection {

	//mock soapMessage response 
		public static SOAPMessage TestSoapWSResponse() throws Exception {
			final String test = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><getUserFromServiceResponse xmlns=\"http://localhost:9000\"><getUserFromServiceResult><NewDataSet xmlns=\"\"><User><id>1</id><name>Vlajko</name><lastName>Vlajkovic</lastName><yearOfBirth>1999</yearOfBirth></User></NewDataSet></getUserFromServiceResult></getUserFromServiceResponse></soap:Body></soap:Envelope>";
			InputStream is = new ByteArrayInputStream(test.getBytes());
			SOAPMessage soapMessage = MessageFactory.newInstance().createMessage(null, is);
			return soapMessage;
		}
		
		
		//mock soapMessage request to test generation of soapMessage
		public static void TestSoapWSRequest(String myNamespace, String myNamespaceURI, String soapEndpointUrl, String soapAction, JSONObject jo) throws SOAPException {
			MessageFactory messageFactory = MessageFactory.newInstance();
			SOAPMessage soapMessage = messageFactory.createMessage();

			TestCreateSoapEnvelope(myNamespace, myNamespaceURI, soapAction, soapMessage, jo);

			MimeHeaders headers = soapMessage.getMimeHeaders();
			headers.addHeader("SOAPAction", soapAction);

			soapMessage.saveChanges();
			
			//print soapMessage
			System.out.println(soapMessage);
		}
		
		public static void TestCreateSoapEnvelope(String myNamespace, String myNamespaceURI, String soapAction, SOAPMessage soapMessage, JSONObject jo) throws SOAPException {
			// TODO half done
			//			SOAPPart soapPart = soapMessage.getSOAPPart();
//
//			// SOAP Envelope
//			SOAPEnvelope envelope = soapPart.getEnvelope();
//			envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
//
//			// SOAP Body
//			SOAPBody soapBody = envelope.getBody();
//			//name of service method
//			SOAPElement soapBodyElem = soapBody.addChildElement(soapAction, myNamespace);
//			
//			Iterator<?> keys = jo.keys();
//			while( keys.hasNext() ) {
//			    String key = (String)keys.next();
//			    if ( jo.get(key) instanceof JSONObject ) {
//			    	if(jo.get(key).equals("User")) {
//			    		SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("User", myNamespace);
//			    	}
//			    }
//			}
//			SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("User", myNamespace);
//			//by what param to find this user
//			SOAPElement soapBodyElem2 = soapBodyElem1.addChildElement("id", myNamespace);
//			soapBodyElem2.addTextNode("1");
		}
}
