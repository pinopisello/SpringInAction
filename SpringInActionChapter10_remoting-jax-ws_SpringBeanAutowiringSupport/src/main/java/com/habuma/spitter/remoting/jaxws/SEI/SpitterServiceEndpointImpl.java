package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.List;
import java.util.logging.Logger;

import javax.jws.WebService;


                      
@WebService(
		name = "SpitterServiceEndpointInterf",//wsdl:portType name="..." DEVE ESSERE IL NOME DELLA INTEFACCIA QUESTA CLASSE IMPLEMENTA!!
		serviceName="SpitterService",//wsdl:definitions name="..."  wsdl:binding name="...SoapBinding"  wsdl:service name="...",
        targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService",
        portName="SpitterServiceEndpointPort" //wsdl:port name="..." 
  )     
   
public class SpitterServiceEndpointImpl implements SpitterService {

    private static final Logger LOG = Logger.getLogger(SpitterServiceEndpointImpl.class.getName());

   
	public List<Spittle> getRecentSpittles(int count) {
		// TODO Auto-generated method stub
		return null;
	}

    
	public void saveSpittle(Spittle spittle) {
		// TODO Auto-generated method stub
		
	}

    
	public void saveSpitter(Spitter spitter) {
		// TODO Auto-generated method stub
		
	}

    
	public void startFollowing(Spitter follower, Spitter followee) {
		// TODO Auto-generated method stub
		
	}

    
	public List<Spittle> getSpittlesForSpitterBySpitter(Spitter spitter) {
		// TODO Auto-generated method stub
		return null;
	}

    
	public List<Spittle> getSpittlesForSpitter(String username) {
		// TODO Auto-generated method stub
		return null;
	}


	public Spitter getSpitter(String username) {
		// TODO Auto-generated method stub
		return null;
	}


	public Spittle getSpittleById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	public void deleteSpittle(long id) {
		// TODO Auto-generated method stub
		
	}


	public List<Spitter> getAllSpitters() {
		// TODO Auto-generated method stub
		return null;
	}


	public Spitter getSpitterById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
