package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.logging.Logger;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.habuma.spitter.remoting.jaxws.server.Spitter;



                      
@WebService(
		name = "SpitterService",//wsdl:portType name="..." da' anche  il nome al file wsdl in java2wsdl
		serviceName="SpitterServiceNomeServizio",//wsdl:definitions name="..."  wsdl:binding name="...SoapBinding"  wsdl:service name="...",
        targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService",
        portName="SpitterServiceEndpointPort" //wsdl:port name="..." 
  ) 
public class SpitterServiceImpl  extends SpringBeanAutowiringSupport implements SpitterService{
    private static final Logger LOG = Logger.getLogger(SpitterServiceImpl.class.getName());
    
    @Autowired
    private SpitterService autowiredBean;
    
    
	public com.habuma.spitter.remoting.jaxws.server.Spitter getSpitterById(long id) {
		System.out.println("getSpitterById ("+id+")");
		Spitter out = autowiredBean.getSpitterById( id);
		return out;
	}


}
