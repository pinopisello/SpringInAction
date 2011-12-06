
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveSpitterById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveSpitterById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spitterInputId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveSpitterById", propOrder = {
    "spitterInputId"
})
public class RetrieveSpitterById {

    protected long spitterInputId;

    /**
     * Gets the value of the spitterInputId property.
     * 
     */
    public long getSpitterInputId() {
        return spitterInputId;
    }

    /**
     * Sets the value of the spitterInputId property.
     * 
     */
    public void setSpitterInputId(long value) {
        this.spitterInputId = value;
    }

}
