package org.kp.BTLfindBenefitPackage.server;

import java.util.List;
import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(
		name = "BenefitBundlePackageInterf",//wsdl:portType name="..." DEVE ESSERE IL NOME DELLA INTEFACCIA QUESTA CLASSE IMPLEMENTA!!
        targetNamespace = "http://Benefit_libs/BTLMediator/BenefitBundlePackageIntf",
        portName="BenefitBundlePackageServicePort", //wsdl:port name="..." 
        serviceName="BenefitBundlePackageService"//wsdl:definitions name="..."  wsdl:binding name="...SoapBinding"  wsdl:service name="...",
   )

public class BenefitBundlePackageInterfImpl implements BenefitBundlePackageInterf {

    private static final Logger LOG = Logger.getLogger(BenefitBundlePackageInterfImpl.class.getName());


    @WebMethod
    public java.lang.String findBenefitPackage( @WebParam(name="Benefitbundle") List<org.kp.BTLfindBenefitPackage.server.BenefitBundle> benefitBundle) { 
        LOG.info("Executing operation findBenefitPackage");
        System.out.println(benefitBundle);
        String _return = "33";
        return _return;
    }

}
