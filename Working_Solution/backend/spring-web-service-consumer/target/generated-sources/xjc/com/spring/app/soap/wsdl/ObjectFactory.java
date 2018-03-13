//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.13 at 02:26:15 PM CET 
//


package com.spring.app.soap.wsdl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.spring.app.soap.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.spring.app.soap.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserRequest }
     * 
     */
    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link GetAgreementsRequest }
     * 
     */
    public GetAgreementsRequest createGetAgreementsRequest() {
        return new GetAgreementsRequest();
    }

    /**
     * Create an instance of {@link GetAgreementsResponse }
     * 
     */
    public GetAgreementsResponse createGetAgreementsResponse() {
        return new GetAgreementsResponse();
    }

    /**
     * Create an instance of {@link Agreement }
     * 
     */
    public Agreement createAgreement() {
        return new Agreement();
    }

    /**
     * Create an instance of {@link GetService1Request }
     * 
     */
    public GetService1Request createGetService1Request() {
        return new GetService1Request();
    }

    /**
     * Create an instance of {@link GetService1Response }
     * 
     */
    public GetService1Response createGetService1Response() {
        return new GetService1Response();
    }

    /**
     * Create an instance of {@link Service1 }
     * 
     */
    public Service1 createService1() {
        return new Service1();
    }

}
