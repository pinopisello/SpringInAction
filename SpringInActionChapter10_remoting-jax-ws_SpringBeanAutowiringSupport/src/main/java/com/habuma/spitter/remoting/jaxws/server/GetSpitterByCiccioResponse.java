
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSpitterByCiccioResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSpitterByCiccioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spitterObject" type="{http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService}spitter" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSpitterByCiccioResponse", propOrder = {
    "spitterObject"
})
public class GetSpitterByCiccioResponse {

    @XmlElement(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService")
    protected Spitter spitterObject;

    /**
     * Gets the value of the spitterObject property.
     * 
     * @return
     *     possible object is
     *     {@link Spitter }
     *     
     */
    public Spitter getSpitterObject() {
        return spitterObject;
    }

    /**
     * Sets the value of the spitterObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spitter }
     *     
     */
    public void setSpitterObject(Spitter value) {
        this.spitterObject = value;
    }

}
