package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.logging.Logger;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;


                      
@WebService(
		name = "SpitterServiceEndpointInterf",//wsdl:portType name="..." DEVE ESSERE IL NOME DELLA INTEFACCIA QUESTA CLASSE IMPLEMENTA!!
		serviceName="SpitterService",//wsdl:definitions name="..."  wsdl:binding name="...SoapBinding"  wsdl:service name="...",
        targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService",
        portName="SpitterServiceEndpointPort" //wsdl:port name="..." 
  )     
   
public class SpitterServiceEndpointImpl extends SpringBeanAutowiringSupport  {
    private static final Logger LOG = Logger.getLogger(SpitterServiceEndpointImpl.class.getName());
    
    @Autowired
    private SpitterService spitterService;
   
    public com.habuma.spitter.remoting.jaxws.server.Spittle getSpittleById(long arg0) { 
        LOG.info("Executing operation getSpittleById");
        System.out.println(arg0);
        try {
            com.habuma.spitter.remoting.jaxws.server.Spittle _return = new com.habuma.spitter.remoting.jaxws.server.Spittle();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf#getSpittlesForSpitter(java.lang.String  arg0 )*
     */
    public java.util.List<com.habuma.spitter.remoting.jaxws.server.Spittle> getSpittlesForSpitter(java.lang.String arg0) { 
        LOG.info("Executing operation getSpittlesForSpitter");
        System.out.println(arg0);
        try {
            java.util.List<com.habuma.spitter.remoting.jaxws.server.Spittle> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf#saveSpitter(com.habuma.spitter.remoting.jaxws.server.Spitter  arg0 )*
     */
    public void saveSpitter(com.habuma.spitter.remoting.jaxws.server.Spitter arg0) { 
        LOG.info("Executing operation saveSpitter");
        System.out.println(arg0);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf#getSpittlesForSpitterBySpitter(com.habuma.spitter.remoting.jaxws.server.Spitter  arg0 )*
     */
    public java.util.List<com.habuma.spitter.remoting.jaxws.server.Spittle> getSpittlesForSpitterBySpitter(com.habuma.spitter.remoting.jaxws.server.Spitter arg0) { 
        LOG.info("Executing operation getSpittlesForSpitterBySpitter");
        System.out.println(arg0);
        try {
            java.util.List<com.habuma.spitter.remoting.jaxws.server.Spittle> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf#saveSpittle(com.habuma.spitter.remoting.jaxws.server.Spittle  arg0 )*
     */
    public void saveSpittle(com.habuma.spitter.remoting.jaxws.server.Spittle arg0) { 
        LOG.info("Executing operation saveSpittle");
        System.out.println(arg0);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf#getRecentSpittles(int  arg0 )*
     */
    public java.util.List<com.habuma.spitter.remoting.jaxws.server.Spittle> getRecentSpittles(int arg0) { 
        LOG.info("Executing operation getRecentSpittles");
        System.out.println(arg0);
        try {
            java.util.List<com.habuma.spitter.remoting.jaxws.server.Spittle> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf#getAllSpitters(*
     */
    public java.util.List<com.habuma.spitter.remoting.jaxws.server.Spitter> getAllSpitters() { 
        LOG.info("Executing operation getAllSpitters");
        try {
            java.util.List<com.habuma.spitter.remoting.jaxws.server.Spitter> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf#deleteSpittle(long  arg0 )*
     */
    public void deleteSpittle(long arg0) { 
        LOG.info("Executing operation deleteSpittle");
        System.out.println(arg0);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf#getSpitter(java.lang.String  arg0 )*
     */
    public com.habuma.spitter.remoting.jaxws.server.Spitter getSpitter(java.lang.String arg0) { 
        LOG.info("Executing operation getSpitter");
        System.out.println(arg0);
        try {
            com.habuma.spitter.remoting.jaxws.server.Spitter _return = new com.habuma.spitter.remoting.jaxws.server.Spitter();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf#getSpitterById(long  arg0 )*
     */
    public com.habuma.spitter.remoting.jaxws.server.Spitter getSpitterById(long arg0) { 
        LOG.info("Executing operation getSpitterById");
        System.out.println(arg0);
        try {
            com.habuma.spitter.remoting.jaxws.server.Spitter _return = new com.habuma.spitter.remoting.jaxws.server.Spitter();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf#startFollowing(com.habuma.spitter.remoting.jaxws.server.Spitter  arg0 ,)com.habuma.spitter.remoting.jaxws.server.Spitter  arg1 )*
     */
    public void startFollowing(com.habuma.spitter.remoting.jaxws.server.Spitter arg0,com.habuma.spitter.remoting.jaxws.server.Spitter arg1) { 
        LOG.info("Executing operation startFollowing");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

