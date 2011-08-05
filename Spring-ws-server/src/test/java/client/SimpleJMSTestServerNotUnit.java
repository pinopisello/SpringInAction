package client;

import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.listener.DefaultMessageListenerContainer;



public class SimpleJMSTestServerNotUnit { 
    private static  Logger log = Logger.getAnonymousLogger(); 
    private static  ApplicationContext ctx;
    private static DefaultMessageListenerContainer  messageListnerContainer ;
    
    
	static{
		  ctx =   new ClassPathXmlApplicationContext("classpath*:spring-soap-jms-server.xml"); 		  log.info("SimpleJMSTestClient setup");
		  log.info("SimpleJMSTestServer setup");
		  messageListnerContainer = (DefaultMessageListenerContainer)ctx.getBean("messageListnerContainer");
		
	}
	
	 public static void main(String[] args)throws InterruptedException {
		 messageListnerContainer.start();
		 System.out.println("DefaultMessageListenerContainer on");
		 while(true){
			 Thread.sleep(5000);
		 }
		 
	 }
	
    
} 