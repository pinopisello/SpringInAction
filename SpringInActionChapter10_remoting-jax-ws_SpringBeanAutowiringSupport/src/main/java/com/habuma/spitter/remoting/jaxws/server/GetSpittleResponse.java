
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSpittleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSpittleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnSpittleObject" type="{http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService}spittle" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSpittleResponse", propOrder = {
    "returnSpittleObject"
})
public class GetSpittleResponse {

    @XmlElement(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService")
    protected Spittle returnSpittleObject;

    /**
     * Gets the value of the returnSpittleObject property.
     * 
     * @return
     *     possible object is
     *     {@link Spittle }
     *     
     */
    public Spittle getReturnSpittleObject() {
        return returnSpittleObject;
    }

    /**
     * Sets the value of the returnSpittleObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spittle }
     *     
     */
    public void setReturnSpittleObject(Spittle value) {
        this.returnSpittleObject = value;
    }

}
