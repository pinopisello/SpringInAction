package com.habuma.spitter.remoting.jaxws.SEI;

import com.habuma.spitter.remoting.jaxws.server.Spitter;



/*@WebService(
		name = "SpitterService",//wsdl:portType name="..." da' anche  il nome al file wsdl in java2wsdl
		serviceName="SpitterServiceNomeServizio",//wsdl:definitions name="..."  wsdl:binding name="...SoapBinding"  wsdl:service name="...",
        targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService",
        portName="SpitterServiceEndpointPort" //wsdl:port name="..." 
  ) */
public interface SpitterService {

  Spitter getSpitterById(long id);
  
 
}
