//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.13 at 01:36:36 PM CET 
//


package com.spring.app.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for service1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="service1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="service1ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="service1Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service1", propOrder = {
    "service1ID",
    "userID",
    "service1Type",
    "date"
})
public class Service1 {

    protected int service1ID;
    protected int userID;
    @XmlElement(required = true)
    protected String service1Type;
    @XmlElement(required = true)
    protected String date;

    /**
     * Gets the value of the service1ID property.
     * 
     */
    public int getService1ID() {
        return service1ID;
    }

    /**
     * Sets the value of the service1ID property.
     * 
     */
    public void setService1ID(int value) {
        this.service1ID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(int value) {
        this.userID = value;
    }

    /**
     * Gets the value of the service1Type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService1Type() {
        return service1Type;
    }

    /**
     * Sets the value of the service1Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService1Type(String value) {
        this.service1Type = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

}
