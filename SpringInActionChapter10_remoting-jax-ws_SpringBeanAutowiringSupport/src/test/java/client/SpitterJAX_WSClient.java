package client;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.habuma.spitter.remoting.jaxws.SEI.Spitter;
import com.habuma.spitter.remoting.jaxws.SEI.SpitterService;


/**
 * Questo client usa JaxWsPortProxyFactoryBean che genera un proxy per il
 * servizio definito nel wsdl [vedi in remote-jax-ws-service-context.xml]
 * 
 *
 */

public class SpitterJAX_WSClient {
	 private static  Logger log = Logger.getAnonymousLogger();
	 private static  ApplicationContext ctx;
	 private static SpitterService spitterService;
 
	
  
  @BeforeClass
	public static void setup(){
		  ctx =   new ClassPathXmlApplicationContext("classpath*:remote-jax-ws-service-context.xml"); 
		  spitterService = (SpitterService)ctx.getBean("spitterService");
		  log.info("SpitterRmiClient setup");
	} 

	@Test
	public void getSpitter()throws InterruptedException{
		Spitter spitter = spitterService.getSpitterById(3);
		log.info("SpitterRmiClient spitter" + spitter.getFullName());
	}
 
	@AfterClass
	public static void cleanup(){
		log.info("SpitterRmiClient cleanup");
	} 
	
}
