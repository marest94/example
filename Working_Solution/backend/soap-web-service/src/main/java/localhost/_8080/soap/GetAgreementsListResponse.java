//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.14 at 02:40:08 PM CET 
//


package localhost._8080.soap;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agreementsList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="agreement" type="{http://localhost:8080/soap}agreementsList"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agreementsList"
})
@XmlRootElement(name = "getAgreementsListResponse")
public class GetAgreementsListResponse {

    @XmlElement(required = true)
    protected GetAgreementsListResponse.AgreementsList agreementsList;

    /**
     * Gets the value of the agreementsList property.
     * 
     * @return
     *     possible object is
     *     {@link GetAgreementsListResponse.AgreementsList }
     *     
     */
    public GetAgreementsListResponse.AgreementsList getAgreementsList() {
        return agreementsList;
    }

    /**
     * Sets the value of the agreementsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAgreementsListResponse.AgreementsList }
     *     
     */
    public void setAgreementsList(GetAgreementsListResponse.AgreementsList value) {
        this.agreementsList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="agreement" type="{http://localhost:8080/soap}agreementsList"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "agreement"
    })
    public static class AgreementsList {

        @XmlElement(required = true)
        protected localhost._8080.soap.AgreementsList agreement;

        /**
         * Gets the value of the agreement property.
         * 
         * @return
         *     possible object is
         *     {@link localhost._8080.soap.AgreementsList }
         *     
         */
        public localhost._8080.soap.AgreementsList getAgreement() {
            return agreement;
        }

        /**
         * Sets the value of the agreement property.
         * 
         * @param value
         *     allowed object is
         *     {@link localhost._8080.soap.AgreementsList }
         *     
         */
        public void setAgreement(localhost._8080.soap.AgreementsList value) {
            this.agreement = value;
        }

    }

}
