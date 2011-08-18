
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRecentSpittles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRecentSpittles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spittleCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecentSpittles", propOrder = {
    "spittleCount"
})
public class GetRecentSpittles {

    protected int spittleCount;

    /**
     * Gets the value of the spittleCount property.
     * 
     */
    public int getSpittleCount() {
        return spittleCount;
    }

    /**
     * Sets the value of the spittleCount property.
     * 
     */
    public void setSpittleCount(int value) {
        this.spittleCount = value;
    }

}
