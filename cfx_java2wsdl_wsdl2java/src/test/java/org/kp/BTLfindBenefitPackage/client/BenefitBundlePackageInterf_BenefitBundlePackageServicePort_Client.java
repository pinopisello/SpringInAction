
package org.kp.BTLfindBenefitPackage.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.namespace.QName;

import org.kp.BTLfindBenefitPackage.server.BenefitBundle;
import org.kp.BTLfindBenefitPackage.server.BenefitBundlePackageInterf;
import org.kp.BTLfindBenefitPackage.server.BenefitBundlePackageService;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-08-18T09:34:08.335-07:00
 * Generated source version: 2.4.1
 * 
 */
public final class BenefitBundlePackageInterf_BenefitBundlePackageServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://Benefit_libs/BTLMediator/BenefitBundlePackageIntf", "BenefitBundlePackageService");

    private BenefitBundlePackageInterf_BenefitBundlePackageServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BenefitBundlePackageService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BenefitBundlePackageService ss = new BenefitBundlePackageService(wsdlURL, SERVICE_NAME);
        BenefitBundlePackageInterf port = ss.getBenefitBundlePackageServicePort();  
        
        {
        System.out.println("Invoking findBenefitPackage...");
        java.util.List<org.kp.BTLfindBenefitPackage.server.BenefitBundle> _findBenefitPackage_arg0 = new ArrayList<org.kp.BTLfindBenefitPackage.server.BenefitBundle>();
        BenefitBundle uno = new BenefitBundle();
        uno.setBundleId("bundle1");
        uno.setBundleVersion(1);   
        
        BenefitBundle due = new BenefitBundle();
        due.setBundleId("bundle2");
        due.setBundleVersion(3);   
              
        _findBenefitPackage_arg0.add(uno);
        _findBenefitPackage_arg0.add(due);
        
        
        
        java.lang.String _findBenefitPackage__return = port.findBenefitPackage(_findBenefitPackage_arg0);
        System.out.println("findBenefitPackage.result=" + _findBenefitPackage__return);


        }

        System.exit(0);
    }

}
