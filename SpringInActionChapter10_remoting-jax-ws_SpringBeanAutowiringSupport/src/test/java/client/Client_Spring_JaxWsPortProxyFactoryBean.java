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
 * Questo client utilizza il Proxy generator "JaxWsPortProxyFactoryBean"
 * da Spring-Web per generare 'on the fly' un proxy SOAP a partire da 
 * Vedi Client_Spring_JaxWsPortProxyFactoryBean.xml
 * 
 * @author W947523
 *
 */

public class Client_Spring_JaxWsPortProxyFactoryBean {
	 private static  Logger log = Logger.getAnonymousLogger();
	 private static  ApplicationContext ctx;
	 private static SpitterService spitterService;
 
	
  
  @BeforeClass
	public static void setup(){
		  ctx =   new ClassPathXmlApplicationContext("classpath*:Client_Spring_JaxWsPortProxyFactoryBean.xml"); 
		  spitterService = (SpitterService)ctx.getBean("spitterService");
		  log.info("Client_Spring_JaxWsPortProxyFactoryBean setup");
	} 

	@Test
	public void getSpitter()throws InterruptedException{
		Spitter spitter = spitterService.getSpitterById(3);
		log.info("Client_Spring_JaxWsPortProxyFactoryBean spitter" + spitter.getFullName());
	}
 
	@AfterClass
	public static void cleanup(){
		log.info("Client_Spring_JaxWsPortProxyFactoryBean cleanup");
	} 
	
}
