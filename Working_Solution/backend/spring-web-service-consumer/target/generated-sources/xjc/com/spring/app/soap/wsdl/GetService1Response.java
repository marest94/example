//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.13 at 03:30:50 PM CET 
//


package com.spring.app.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="service1" type="{http://localhost:8080/soap}service1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "service1"
})
@XmlRootElement(name = "getService1Response")
public class GetService1Response {

    @XmlElement(required = true)
    protected Service1 service1;

    /**
     * Gets the value of the service1 property.
     * 
     * @return
     *     possible object is
     *     {@link Service1 }
     *     
     */
    public Service1 getService1() {
        return service1;
    }

    /**
     * Sets the value of the service1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service1 }
     *     
     */
    public void setService1(Service1 value) {
        this.service1 = value;
    }

}
