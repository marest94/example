package com.spring.connection;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

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

//ref.:https://stackoverflow.com/questions/20460870/java-soap-request-reading-soap-response
public class SoapServerConnection {

	// should set pojo User model class for example

	// SAAJ - SOAP Client Testing
	public static void main(String[] args) {
		/* This main method connects to server WebService
		 * To call other WebService from server, change the parameters below, which are: - the SOAP Endpoint
		 * URL (that is, where the service is responding from) - the SOAP Action
		 * 
		 * Also change the contents of the method createSoapEnvelope() in this class. It
		 * constructs the inner part of the SOAP envelope that is actually sent.
		 */
		String soapEndpointUrl = "http://localhost:9000/service"; // url of service
		String soapAction = "http://localhost:9000/getUserFromService"; // method of service

		// get message via soap on given action/method
		callSoapWebService(soapEndpointUrl, soapAction);
	}

	/* This method creates an xml envelope
	 *
	 * TODO make it dynamic to some extent...
	 * 
	 */
	private static void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
		SOAPPart soapPart = soapMessage.getSOAPPart();

		String myNamespace = "myNamespace";
		String myNamespaceURI = "http://localhost:9000";

		// SOAP Envelope
		SOAPEnvelope envelope = soapPart.getEnvelope();
		envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);

		// SOAP Body
		SOAPBody soapBody = envelope.getBody();
		SOAPElement soapBodyElem = soapBody.addChildElement("getUserFromService", myNamespace);
		SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("User", myNamespace);
		SOAPElement soapBodyElem2 = soapBodyElem1.addChildElement("userName", myNamespace);
		soapBodyElem2.addTextNode("Mile");
		SOAPElement soapBodyElem3 = soapBodyElem1.addChildElement(lastName, myNamespace);
		soapBodyElem3.addTextNode(lastName);
		SOAPElement soapBodyElem4 = soapBodyElem1.addChildElement(phone, myNamespace);
		soapBodyElem4.addTextNode(phone);

		/*
		 * <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"
		 * xmlns:myNamespace="http://localhost:9000"> <SOAP-ENV:Header/> <SOAP-ENV:Body>
		 * <myNamespace:getUserFromServis> <myNamespace:User>
		 * <myNamespace:userName>userName</myNamespace:userName>
		 * <myNamespace:lastName>lastName</myNamespace:lastName>
		 * <myNamespace:phone>phone</myNamespace:phone> </myNamespace:User>
		 * </myNamespace:getUserFromServis> </SOAP-ENV:Body> </SOAP-ENV:Envelope>
		 */
	}

	// get message from soap
	private static void callSoapWebService(String soapEndpointUrl, String soapAction) {
		try {
			// Create SOAP Connection
			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
			SOAPConnection soapConnection = soapConnectionFactory.createConnection();

			// Send SOAP Message to SOAP Server
			SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);

			// Print the SOAP Response
			System.out.println("Response SOAP Message:");
			soapResponse.writeTo(System.out);
			System.out.println();

			soapConnection.close();
		} catch (Exception e) {
			System.err.println(
					"\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
			e.printStackTrace();
		}
		/*
		 * From server: <?xml version="1.0" encoding="utf-8"?><soap:Envelope
		 * xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
		 * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		 * xmlns:xsd="http://www.w3.org/2001/XMLSchema"> <soap:Body>
		 * <getUserFromServiceResponse xmlns="http://localhost:9000">
		 * <getUserFromServiceResult> <NewDataSet xmlns=""> <User> <name>Vlajko</name>
		 * <lastName>Vlajkovic</lastName> <phone>0603112899</phone> </User>
		 * </NewDataSet> </getUserFromServiceResult> </getUserFromServiceResponse>
		 * </soap:Body> </soap:Envelope>
		 */
	}

	// create soap request
	private static SOAPMessage createSOAPRequest(String soapAction) throws Exception {
		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapMessage = messageFactory.createMessage();

		createSoapEnvelope(soapMessage);

		MimeHeaders headers = soapMessage.getMimeHeaders();
		headers.addHeader("SOAPAction", soapAction);

		soapMessage.saveChanges();

		/* Print the request message, just for debugging purposes */
		System.out.println("Request SOAP Message:");
		soapMessage.writeTo(System.out);
		System.out.println("\n");

		return soapMessage;

	}
	
	public static SOAPMessage createTestSoapRequest() throws Exception {
		final String test = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><getUserFromServiceResponse xmlns=\"http://localhost:9000\"><getUserFromServiceResult><NewDataSet xmlns=\"\"><User><id>1</id><name>Vlajko</name><lastName>Vlajkovic</lastName><yearOfBirth>1999</yearOfBirth></User></NewDataSet></getUserFromServiceResult></getUserFromServiceResponse></soap:Body></soap:Envelope>";
		InputStream is = new ByteArrayInputStream(test.getBytes());
		SOAPMessage soapMessage = MessageFactory.newInstance().createMessage(null, is);
		return soapMessage;
		
	}

}
