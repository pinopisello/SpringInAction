package com.habuma.spitter.remoting.jaxws.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-10-07T13:57:32.936-07:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "SpitterServiceNomeServizio", 
                  wsdlLocation = "file:/C:/Miei/Eclipse_Workspaces/SpringInAction/SpringInActionChapter10_remoting-jax-ws_SpringBeanAutowiringSupport/webroot/WEB-INF/wsdl/SpitterService.wsdl",
                  targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService") 
public class SpitterServiceNomeServizio extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "SpitterServiceNomeServizio");
    public final static QName SpitterServiceEndpointPort = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "SpitterServiceEndpointPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Miei/Eclipse_Workspaces/SpringInAction/SpringInActionChapter10_remoting-jax-ws_SpringBeanAutowiringSupport/webroot/WEB-INF/wsdl/SpitterService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SpitterServiceNomeServizio.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Miei/Eclipse_Workspaces/SpringInAction/SpringInActionChapter10_remoting-jax-ws_SpringBeanAutowiringSupport/webroot/WEB-INF/wsdl/SpitterService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SpitterServiceNomeServizio(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SpitterServiceNomeServizio(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SpitterServiceNomeServizio() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SpitterService
     */
    @WebEndpoint(name = "SpitterServiceEndpointPort")
    public SpitterService getSpitterServiceEndpointPort() {
        return super.getPort(SpitterServiceEndpointPort, SpitterService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SpitterService
     */
    @WebEndpoint(name = "SpitterServiceEndpointPort")
    public SpitterService getSpitterServiceEndpointPort(WebServiceFeature... features) {
        return super.getPort(SpitterServiceEndpointPort, SpitterService.class, features);
    }

}
