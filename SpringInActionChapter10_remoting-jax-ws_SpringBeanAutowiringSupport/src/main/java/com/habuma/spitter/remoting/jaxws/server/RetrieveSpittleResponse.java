
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveSpittleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveSpittleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spittleObject" type="{http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService}spittle" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveSpittleResponse", propOrder = {
    "spittleObject"
})
public class RetrieveSpittleResponse {

    @XmlElement(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService")
    protected Spittle spittleObject;

    /**
     * Gets the value of the spittleObject property.
     * 
     * @return
     *     possible object is
     *     {@link Spittle }
     *     
     */
    public Spittle getSpittleObject() {
        return spittleObject;
    }

    /**
     * Sets the value of the spittleObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spittle }
     *     
     */
    public void setSpittleObject(Spittle value) {
        this.spittleObject = value;
    }

}
