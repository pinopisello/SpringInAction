
package org.kp.BTLfindBenefitPackage.server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findBenefitPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findBenefitPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benefitbundle" type="{http://Benefit_libs/BTLMediator/BenefitBundlePackageIntf}BenefitBundle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findBenefitPackage", propOrder = {
    "benefitbundle"
})
public class FindBenefitPackage {

    @XmlElement(name = "Benefitbundle")
    protected List<BenefitBundle> benefitbundle;

    /**
     * Gets the value of the benefitbundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benefitbundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenefitbundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenefitBundle }
     * 
     * 
     */
    public List<BenefitBundle> getBenefitbundle() {
        if (benefitbundle == null) {
            benefitbundle = new ArrayList<BenefitBundle>();
        }
        return this.benefitbundle;
    }

}
