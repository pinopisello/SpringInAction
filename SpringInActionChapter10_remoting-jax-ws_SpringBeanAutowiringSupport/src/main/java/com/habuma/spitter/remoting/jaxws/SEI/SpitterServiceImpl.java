package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.logging.Logger;

import javax.jws.WebService;

import com.habuma.spitter.remoting.jaxws.server.Spitter;



                      
@WebService(
		name = "SpitterService",//wsdl:portType name="..." da' anche  il nome al file wsdl in java2wsdl
		serviceName="SpitterServiceNomeServizio",//wsdl:definitions name="..."  wsdl:binding name="...SoapBinding"  wsdl:service name="...",
        targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService",
        portName="SpitterServiceEndpointPort" //wsdl:port name="..." 
  ) 
public class SpitterServiceImpl implements SpitterService {
    private static final Logger LOG = Logger.getLogger(SpitterServiceImpl.class.getName());


	public com.habuma.spitter.remoting.jaxws.server.Spitter getSpitterById(long id) {
		System.out.println("getSpitterById ("+id+")");
		Spitter out = new Spitter();
		out.setFullName("nome pieno");
		out.setPassword("parola d ordine");
		return out;
	}


}
