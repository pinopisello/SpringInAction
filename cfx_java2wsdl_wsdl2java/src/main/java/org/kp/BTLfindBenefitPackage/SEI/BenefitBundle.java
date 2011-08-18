
package org.kp.BTLfindBenefitPackage.SEI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenefitBundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenefitBundle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BundleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BundleVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenefitBundle", propOrder = {
    "bundleId",
	"bundleVersion"
})
public class BenefitBundle {

    @XmlElement(name = "BundleId", required = false,nillable=true)
    protected String bundleId;
    @XmlElement(name = "BundleVersion")
    protected int bundleVersion;

    /**
     * Gets the value of the bundleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * Sets the value of the bundleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleId(String value) {
        this.bundleId = value;
    }

    /**
     * Gets the value of the bundleVersion property.
     * 
     */
    public int getBundleVersion() {
        return bundleVersion;
    }

    /**
     * Sets the value of the bundleVersion property.
     * 
     */
    public void setBundleVersion(int value) {
        this.bundleVersion = value;
    }

}
