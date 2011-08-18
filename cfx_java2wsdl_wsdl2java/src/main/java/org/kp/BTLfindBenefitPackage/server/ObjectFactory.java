
package org.kp.BTLfindBenefitPackage.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.kp.BTLfindBenefitPackage.server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindBenefitPackageResponse_QNAME = new QName("http://Benefit_libs/BTLMediator/BenefitBundlePackageIntf", "findBenefitPackageResponse");
    private final static QName _FindBenefitPackage_QNAME = new QName("http://Benefit_libs/BTLMediator/BenefitBundlePackageIntf", "findBenefitPackage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kp.BTLfindBenefitPackage.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindBenefitPackageResponse }
     * 
     */
    public FindBenefitPackageResponse createFindBenefitPackageResponse() {
        return new FindBenefitPackageResponse();
    }

    /**
     * Create an instance of {@link FindBenefitPackage }
     * 
     */
    public FindBenefitPackage createFindBenefitPackage() {
        return new FindBenefitPackage();
    }

    /**
     * Create an instance of {@link BenefitBundle }
     * 
     */
    public BenefitBundle createBenefitBundle() {
        return new BenefitBundle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBenefitPackageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Benefit_libs/BTLMediator/BenefitBundlePackageIntf", name = "findBenefitPackageResponse")
    public JAXBElement<FindBenefitPackageResponse> createFindBenefitPackageResponse(FindBenefitPackageResponse value) {
        return new JAXBElement<FindBenefitPackageResponse>(_FindBenefitPackageResponse_QNAME, FindBenefitPackageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBenefitPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Benefit_libs/BTLMediator/BenefitBundlePackageIntf", name = "findBenefitPackage")
    public JAXBElement<FindBenefitPackage> createFindBenefitPackage(FindBenefitPackage value) {
        return new JAXBElement<FindBenefitPackage>(_FindBenefitPackage_QNAME, FindBenefitPackage.class, null, value);
    }

}
