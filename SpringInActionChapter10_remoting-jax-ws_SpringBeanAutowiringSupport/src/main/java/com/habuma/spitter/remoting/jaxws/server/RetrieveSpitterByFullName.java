
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveSpitterByFullName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveSpitterByFullName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spitterInputFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveSpitterByFullName", propOrder = {
    "spitterInputFullName"
})
public class RetrieveSpitterByFullName {

    protected String spitterInputFullName;

    /**
     * Gets the value of the spitterInputFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpitterInputFullName() {
        return spitterInputFullName;
    }

    /**
     * Sets the value of the spitterInputFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpitterInputFullName(String value) {
        this.spitterInputFullName = value;
    }

}
