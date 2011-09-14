
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addSpittle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addSpittle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spittle" type="{http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService}spittle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSpittle", propOrder = {
    "spittle"
})
public class AddSpittle {

    protected Spittle spittle;

    /**
     * Gets the value of the spittle property.
     * 
     * @return
     *     possible object is
     *     {@link Spittle }
     *     
     */
    public Spittle getSpittle() {
        return spittle;
    }

    /**
     * Sets the value of the spittle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spittle }
     *     
     */
    public void setSpittle(Spittle value) {
        this.spittle = value;
    }

}
