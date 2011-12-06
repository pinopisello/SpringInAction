
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSpittle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSpittle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spittleInputId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSpittle", propOrder = {
    "spittleInputId"
})
public class GetSpittle {

    protected long spittleInputId;

    /**
     * Gets the value of the spittleInputId property.
     * 
     */
    public long getSpittleInputId() {
        return spittleInputId;
    }

    /**
     * Sets the value of the spittleInputId property.
     * 
     */
    public void setSpittleInputId(long value) {
        this.spittleInputId = value;
    }

}
