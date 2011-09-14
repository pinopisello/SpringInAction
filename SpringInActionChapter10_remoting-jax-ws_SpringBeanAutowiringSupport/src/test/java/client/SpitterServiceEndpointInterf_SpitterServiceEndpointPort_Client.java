
package client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.habuma.spitter.remoting.jaxws.server.Spitter;
import com.habuma.spitter.remoting.jaxws.server.SpitterService;
import com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf;
import com.habuma.spitter.remoting.jaxws.server.Spittle;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-09-14T13:48:05.904-07:00
 * Generated source version: 2.4.1
 * 
 */
public final class SpitterServiceEndpointInterf_SpitterServiceEndpointPort_Client {

    private static final QName SERVICE_NAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "SpitterService");

    private SpitterServiceEndpointInterf_SpitterServiceEndpointPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SpitterService.WSDL_LOCATION;
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
      
        SpitterService ss = new SpitterService(wsdlURL, SERVICE_NAME);
        SpitterServiceEndpointInterf port = ss.getSpitterServiceEndpointPort();  
        
        {
        System.out.println("Invoking getSpittlesForSpitter...");
        com.habuma.spitter.remoting.jaxws.server.Spitter _getSpittlesForSpitter_spitter = null;
        java.util.List<com.habuma.spitter.remoting.jaxws.server.Spittle> _getSpittlesForSpitter__return = port.getSpittlesForSpitter(_getSpittlesForSpitter_spitter);
        System.out.println("getSpittlesForSpitter.result=" + _getSpittlesForSpitter__return);


        }
        {
        System.out.println("Invoking addSpittle...");
        com.habuma.spitter.remoting.jaxws.server.Spittle _addSpittle_spittle = null;
        port.addSpittle(_addSpittle_spittle);


        }
        {
        System.out.println("Invoking getRecentSpittles...");
        int _getRecentSpittles_spittleCount = 0;
        java.util.List<com.habuma.spitter.remoting.jaxws.server.Spittle> _getRecentSpittles__return = port.getRecentSpittles(_getRecentSpittles_spittleCount);
        System.out.println("getRecentSpittles.result=" + _getRecentSpittles__return);


        }
        {
        System.out.println("Invoking deleteSpittle...");
        long _deleteSpittle_spittleId = 0;
        port.deleteSpittle(_deleteSpittle_spittleId);


        }

        System.exit(0);
    }

}
