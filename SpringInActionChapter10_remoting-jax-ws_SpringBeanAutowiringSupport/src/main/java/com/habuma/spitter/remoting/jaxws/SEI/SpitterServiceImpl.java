package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.logging.Logger;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebParam.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.habuma.spitter.remoting.jaxws.server.Spitter;
import com.habuma.spitter.remoting.jaxws.server.Spittle;


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
    

	public Spittle getSpittleById( long id){
		System.out.println("getSpitterById ("+id+")");
		return new Spittle();
	}
	
	public Spitter getSpitterById( long id) {
		System.out.println("getSpittleById ("+id+")");
		Spitter out = autowiredBean.getSpitterById( id);
		return out;
	}
	
	public Spitter getSpitterByFullName(String fullName){
		return new Spitter();
	}
	  
	  
}
