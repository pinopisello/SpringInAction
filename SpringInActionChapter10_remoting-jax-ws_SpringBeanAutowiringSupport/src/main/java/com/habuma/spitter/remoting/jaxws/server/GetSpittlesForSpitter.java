
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSpittlesForSpitter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSpittlesForSpitter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spitter" type="{http://pippo/SpitterService}spitter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSpittlesForSpitter", propOrder = {
    "spitter"
})
public class GetSpittlesForSpitter {

    protected Spitter spitter;

    /**
     * Gets the value of the spitter property.
     * 
     * @return
     *     possible object is
     *     {@link Spitter }
     *     
     */
    public Spitter getSpitter() {
        return spitter;
    }

    /**
     * Sets the value of the spitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spitter }
     *     
     */
    public void setSpitter(Spitter value) {
        this.spitter = value;
    }

}
