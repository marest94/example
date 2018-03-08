package com.spring.connection;

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
	 * to be sent to a specific ws
	 * TODO make it dynamic to some extent...
	 * it now works only by sending hardcode data
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
		//name of service method
		SOAPElement soapBodyElem = soapBody.addChildElement("getUserFromService", myNamespace);
		//what to expect
		SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("User", myNamespace);
		//by what param to find this user
		SOAPElement soapBodyElem2 = soapBodyElem1.addChildElement("id", myNamespace);
		soapBodyElem2.addTextNode("1");

		/*	How this SOAPmassage to server should look like
		 * <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"xmlns:myNamespace="http://localhost:9000">
		 * 		<SOAP-ENV:Header/> 
		 * 			<SOAP-ENV:Body>
		 * 				<myNamespace:getUserFromServis>
		 * 					<myNamespace:User> 
		 * 						<myNamespace:id>1</myNamespace:id> 
		 * 					</myNamespace:User>
		 * 				</myNamespace:getUserFromServis> 
		 * 			</SOAP-ENV:Body> 
		 * 		</SOAP-ENV:Envelope>
		 */
	}

	// get message from soap
	//TODO make soapEndpointUrl and soapAction dynamic to call for differnet ws
	public static void callSoapWebService(String soapEndpointUrl, String soapAction) {
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
		 * How this SOAPmassage from server should look like From server: 
		 * <?xmlversion="1.0" encoding="utf-8"?>
		 * 	<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
		 * 		<soap:Body>
		 * 			<getUserFromServiceResponse xmlns="http://localhost:9000">
		 * 				<getUserFromServiceResult> 
		 * 					<NewDataSet xmlns=""> 
		 * 						<User>
		 * 							<id>1</id>
		 * 							<name>Vlajko</name> 
		 * 							<lastName>Vlajkovic</lastName>
		 * 							<yearOfBirth>0603112899</yearOfBirth> 
		 * 						</User> 	
		 * 					</NewDataSet>
		 * 				</getUserFromServiceResult> 
		 * 			</getUserFromServiceResponse> 
		 * 		</soap:Body>
		 * </soap:Envelope>
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

}
