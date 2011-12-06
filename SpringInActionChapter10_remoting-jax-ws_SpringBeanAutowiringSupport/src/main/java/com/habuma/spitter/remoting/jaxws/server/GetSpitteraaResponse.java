
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSpitteraaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSpitteraaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spitterObject1" type="{http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService}spitter" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSpitteraaResponse", propOrder = {
    "spitterObject1"
})
public class GetSpitteraaResponse {

    @XmlElement(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService")
    protected Spitter spitterObject1;

    /**
     * Gets the value of the spitterObject1 property.
     * 
     * @return
     *     possible object is
     *     {@link Spitter }
     *     
     */
    public Spitter getSpitterObject1() {
        return spitterObject1;
    }

    /**
     * Sets the value of the spitterObject1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spitter }
     *     
     */
    public void setSpitterObject1(Spitter value) {
        this.spitterObject1 = value;
    }

}
