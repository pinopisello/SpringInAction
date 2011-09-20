
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-09-19T15:07:34.253-07:00
 * Generated source version: 2.4.1
 * 
 */
 
public class SpitterServiceEndpointInterf_SpitterServiceEndpointPort_Server{

    protected SpitterServiceEndpointInterf_SpitterServiceEndpointPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new SpitterServiceEndpointInterfImpl();
        String address = "http://127.0.0.1:8080/SpitterService/ws/spitterService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new SpitterServiceEndpointInterf_SpitterServiceEndpointPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
