package client;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import common.CommonTestCase;


public class SimpleJMSTestServer  extends CommonTestCase{
	
	@BeforeClass
	public static void setup(){
		  ctx =   new ClassPathXmlApplicationContext("classpath*:spring-soap-jms-server.xml"); 		  log.info("SimpleJMSTestClient setup");
		  log.info("SimpleJMSTestServer setup");
	} 
	
	
	
	@AfterClass
	public static void cleanup(){
		log.info("SimpleJMSTestServer cleanup");
	}

	
	@Test
	public void sendTestJMS()throws InterruptedException{
		DefaultMessageListenerContainer  messageListnerContainer = (DefaultMessageListenerContainer)ctx.getBean("messageListnerContainer");
		messageListnerContainer.start();
		System.out.println("DefaultMessageListenerContainer on");//Blocca il debugger qua , altrimenti il processo esce!
																 //JUnit non permette di mettere un while(true) [lancia errore]
																 //Meglio usare SimpleJMSTestServerNotUnit che permette while(true)

	  }
	
}
