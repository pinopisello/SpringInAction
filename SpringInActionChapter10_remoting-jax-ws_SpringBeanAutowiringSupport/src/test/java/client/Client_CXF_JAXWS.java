package client;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.habuma.spitter.remoting.jaxws.SEI.SpitterService;
import com.habuma.spitter.remoting.jaxws.server.Spitter;

/**
 * 
 * Questo client utilizza il managed-bean CXF <jaxws:client> that can be used on the client side. 
 * You'll give it:
 * 	a bean name, 
 * 	the service interface,
 *  the service URL 
 *  
 * and it will create a bean with the specified name, implementing the service interface,
 *  and invoking the remote SOAP service under the covers.
 *  
 * Vedi Client_CXF_JAXWS.xml 
 * @author W947523
 *
 */
public class Client_CXF_JAXWS {
	 private static  Logger log = Logger.getAnonymousLogger();
	 private static  ApplicationContext ctx;
	 private static SpitterService spitterService;
 
	
  
  @BeforeClass
	public static void setup(){
		  ctx =   new ClassPathXmlApplicationContext("classpath*:Client_CXF_JAXWS.xml"); 
		  spitterService = (SpitterService)ctx.getBean("spitterService");
		  log.info("Client_CXF_JAXWS setup");
	} 

	@Test
	public void getSpitter()throws InterruptedException{
		Spitter spitter = spitterService.getSpitterById(3);
		log.info("Client_CXF_JAXWS spitter" + spitter.getFullName());
	}
 
	@AfterClass
	public static void cleanup(){
		log.info("Client_CXF_JAXWS cleanup");
	} 
	
}


