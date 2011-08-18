package client;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.service.SpitterService;

public class SpitterRmiClient {
	 private static  Logger log = Logger.getAnonymousLogger();
	 private static  ApplicationContext ctx;
	 private static SpitterService spitterService;
 
	  
  
  @BeforeClass
	public static void setup(){
		  ctx =   new ClassPathXmlApplicationContext("classpath*:remote-service-context-client.xml"); 
		  spitterService = (SpitterService)ctx.getBean("spitterService");
		  log.info("SpitterRmiClient setup");
	} 

	@Test
	public void getSpitter()throws InterruptedException{
		Spitter spitter = spitterService.getSpitter(3);
		log.info("SpitterRmiClient spitter" + spitter.getFullName());
	}
 
	@AfterClass
	public static void cleanup(){
		log.info("SpitterRmiClient cleanup");
	} 
	
}
