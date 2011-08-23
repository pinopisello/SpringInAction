


import java.util.List;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.habuma.spitter.remoting.jaxws.server.Spitter;
import com.habuma.spitter.remoting.jaxws.server.SpitterServiceEndpointInterf;
import com.habuma.spitter.remoting.jaxws.server.Spittle;


public class JaxWsPortProxyFactoryBean_client   {
	 protected static  Logger log = Logger.getAnonymousLogger();
	 protected static  ApplicationContext ctx;
	 
	
	@BeforeClass
	public static void setup(){
		  ctx =   new ClassPathXmlApplicationContext("classpath*:remoting_jax-ws_client.xml"); 		
		  log.info("JaxWsPortProxyFactoryBean_client setup");
	}
	
	
	@AfterClass
	public static void cleanup(){
		log.info("JaxWsPortProxyFactoryBean_client cleanup");
	}

	
	@Test
	public void invoke() {
		SpitterServiceEndpointInterf serviceProxy = (SpitterServiceEndpointInterf)ctx.getBean("spitterServiceProxy");
		Spitter input = new Spitter();
		input.setFullName("pippo Spitter");
		List<Spittle> returned_spittles = serviceProxy.getSpittlesForSpitter(input);
		log.info("Ritornate " + returned_spittles.size() +" spittles");
		
		
		 
	}

}
