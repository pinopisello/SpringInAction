package com.habuma.spitter.remoting.jaxws.server;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-09-16T13:50:52.769-07:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "SpitterService", 
                  wsdlLocation = "file:/C:/Miei/Eclipse_Workspaces/SpringInAction/SpringInActionChapter10_remoting-jax-ws_SpringBeanAutowiringSupport/webroot/WEB-INF/wsdl/SpitterService.wsdl",
                  targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService") 
public class SpitterService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "SpitterService");
    public final static QName SpitterServiceEndpointPort = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "SpitterServiceEndpointPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Miei/Eclipse_Workspaces/SpringInAction/SpringInActionChapter10_remoting-jax-ws_SpringBeanAutowiringSupport/webroot/WEB-INF/wsdl/SpitterService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SpitterService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Miei/Eclipse_Workspaces/SpringInAction/SpringInActionChapter10_remoting-jax-ws_SpringBeanAutowiringSupport/webroot/WEB-INF/wsdl/SpitterService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SpitterService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SpitterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SpitterService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SpitterServiceEndpointInterf
     */
    @WebEndpoint(name = "SpitterServiceEndpointPort")
    public SpitterServiceEndpointInterf getSpitterServiceEndpointPort() {
        return super.getPort(SpitterServiceEndpointPort, SpitterServiceEndpointInterf.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SpitterServiceEndpointInterf
     */
    @WebEndpoint(name = "SpitterServiceEndpointPort")
    public SpitterServiceEndpointInterf getSpitterServiceEndpointPort(WebServiceFeature... features) {
        return super.getPort(SpitterServiceEndpointPort, SpitterServiceEndpointInterf.class, features);
    }

}
