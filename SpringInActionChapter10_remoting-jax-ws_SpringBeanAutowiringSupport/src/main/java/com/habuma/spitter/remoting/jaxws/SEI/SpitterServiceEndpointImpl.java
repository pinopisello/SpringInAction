package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.List;
import java.util.logging.Logger;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;


                      
@WebService(
		name = "SpitterServiceEndpointInterf",//wsdl:portType name="..." DEVE ESSERE IL NOME DELLA INTEFACCIA QUESTA CLASSE IMPLEMENTA!!
		serviceName="SpitterService",//wsdl:definitions name="..."  wsdl:binding name="...SoapBinding"  wsdl:service name="...",
        targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService",
        portName="SpitterServiceEndpointPort" //wsdl:port name="..." 
  )     
   
public class SpitterServiceEndpointImpl implements SpitterServiceEndpointInterf {

    private static final Logger LOG = Logger.getLogger(SpitterServiceEndpointImpl.class.getName());


	public void addSpittle( @WebParam(name="spittle") Spittle spittle) {
		// TODO Auto-generated method stub
		
	}


	public void deleteSpittle(@WebParam(name="spittleId") long spittleId) {
		// TODO Auto-generated method stub
		
	}


	public List<Spittle> getRecentSpittles(@WebParam(name="spittleCount") int spittleCount) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Spittle> getSpittlesForSpitter(@WebParam(name="spitter") Spitter spitter) {
		// TODO Auto-generated method stub
		return null;
	}



}
