import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Questo client utilizza il JaxWsPortProxyFactoryBean Spring Bean that produces a proxy that knows
 * how to talk to a SOAP web service.
 * The proxy itself is created to implement the service’s interface (vedi SpringInAction,pag 275).
 * You'll give it:
 * 	bean name                       				bean id="spitterService"
 * 	locazione wsdl [file or http]					p:wsdlDocumentUrl="http://127.0.0.1:8080/SpitterService/ws/spitterService?wsdl"
 * 	nome del servizio a cui si vuole accedere		p:serviceName="SpitterServiceNomeServizio"  
 * 	nome del port a cui si vuole accedere 	    	p:portName="SpitterServiceEndpointPort"            
 * 	nome del namespace a cui si vuole accedere	    p:serviceInterface="SpitterService"                 
 * 	interfaccia SEI con le operazaioni del servizio	p:namespaceUri="http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService" /> 
 *  
 *  
 * Vedi Client_Spring_JaxWsPortProxyFactoryBean.xml
 * @author W947523
 *
 */





public class Client_JaxWsPortProxyFactoryBean {
	 private static  Logger log = Logger.getAnonymousLogger();
	 private static  ApplicationContext ctx;
	 private static SpitterService spitterService;
 
	
  
  @BeforeClass
	public static void setup(){
		  ctx =   new ClassPathXmlApplicationContext("classpath*:Client_Spring_JaxWsPortProxyFactoryBean.xml"); 
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
