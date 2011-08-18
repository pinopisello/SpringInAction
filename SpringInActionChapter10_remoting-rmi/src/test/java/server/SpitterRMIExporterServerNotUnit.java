package server;


import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpitterRMIExporterServerNotUnit { 
    private static  Logger log = Logger.getAnonymousLogger(); 
    private static  ApplicationContext ctx;
 
    
	static{
		  ctx =   new ClassPathXmlApplicationContext("classpath*:remote-service-context-server.xml"); 		 
		  log.info("RmiServiceExporter setup");
		
	}
	
	 public static void main(String[] args)throws InterruptedException {
		 System.out.println("RmiServiceExporter on");
		 while(true){//loop infinito per tenere la JVM attiva, altrimenti main terminerebbe e RmiServiceExporter andrebbe giu!
			 Thread.sleep(5000);
		 }
		 
	 }
	
    
} 