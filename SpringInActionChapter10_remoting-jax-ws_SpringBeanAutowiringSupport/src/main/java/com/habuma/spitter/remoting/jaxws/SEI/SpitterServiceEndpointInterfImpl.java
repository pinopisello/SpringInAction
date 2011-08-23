package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;
import com.habuma.spitter.service.SpitterService;


                      
@WebService(
		name = "SpitterServiceEndpointInterf",//wsdl:portType name="..." DEVE ESSERE IL NOME DELLA INTEFACCIA QUESTA CLASSE IMPLEMENTA!!
		targetNamespace = "http://pippo/SpitterService",
		portName="SpitterServiceEndpointPort", //wsdl:port name="..." 
		serviceName="SpitterService"//wsdl:definitions name="..."  wsdl:binding name="...SoapBinding"  wsdl:service name="...",
  )     
   
public class SpitterServiceEndpointInterfImpl extends SpringBeanAutowiringSupport implements SpitterService {

    private static final Logger LOG = Logger.getLogger(SpitterServiceEndpointInterfImpl.class.getName());
   
    @Autowired
    com.habuma.spitter.service.SpitterService spitterService;
    
    
    
    public java.util.List<Spittle> getSpittlesForSpitter( @WebParam(name="spitter")Spitter spitter) { 
        LOG.info("Executing operation getSpittlesForSpitter");
        System.out.println(spitter);
        try {
            java.util.List<Spittle> out = new ArrayList<Spittle>();
            Spittle uno = new Spittle();
            uno.setText("uno");
            Spittle due = new Spittle();
            uno.setText("due");            
            out.add(uno);
            out.add(due);            
            return out;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }


    public void addSpittle( @WebParam(name="spittle")Spittle spittle) { 
        LOG.info("Executing operation addSpittle");
        System.out.println(spittle);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

 
    public void deleteSpittle( @WebParam(name="spittleid")long spittleid) { 
        LOG.info("Executing operation deleteSpittle");
        System.out.println(spittleid);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }


    public java.util.List<Spittle> getRecentSpittles( @WebParam(name="spittleCount")int spittleCount) { 
        LOG.info("Executing operation getRecentSpittles");
        System.out.println(spittleCount);
        try {
            java.util.List<Spittle> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }


	@Override
	public void saveSpittle(Spittle spittle) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void saveSpitter(Spitter spitter) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Spitter getSpitter(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void startFollowing(Spitter follower, Spitter followee) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Spittle> getSpittlesForSpitter(String username) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Spitter getSpitter(String username) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Spittle getSpittleById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Spitter> getAllSpitters() {
		// TODO Auto-generated method stub
		return null;
	}



}
