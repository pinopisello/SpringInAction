
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.habuma.spitter.remoting.jaxws.server;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-09-16T13:50:52.488-07:00
 * Generated source version: 2.4.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "SpitterService",
                      portName = "SpitterServiceEndpointPort",
                      targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService",
                      wsdlLocation = "file:/C:/Miei/Eclipse_Workspaces/SpringInAction/SpringInActionChapter10_remoting-jax-ws_SpringBeanAutowiringSupport/webroot/WEB-INF/wsdl/SpitterService.wsdl",
                      endpointInterface = "com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf")
                      
public class SpitterServiceEndpointInterfImpl implements SpitterServiceEndpointInterf {

    private static final Logger LOG = Logger.getLogger(SpitterServiceEndpointInterfImpl.class.getName());

    /* (non-Javadoc)
     * @see com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf#getSpittleById(long  arg0 )*
     */
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
