package cap3;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.CommonTestCase;

public class TestInjectAnnotaion  extends CommonTestCase{
	 
	@BeforeClass
	public static void setup(){
		  ctx =   new ClassPathXmlApplicationContext("classpath:cap3/testInjectAnnotaion.xml");  
		  log.info("TestInjectAnnotaion setup");
	}
	
	
	@AfterClass
	public static void cleanup(){
		log.info("TestInjectAnnotaion cleanup");
	}
	
	
	
	//Per renmdere Spring sensibile alle annotazioni @Inject,@Autowired,@Resource,@postConstruct,etc
	//bisogna abilitare  <context:annotation-config /> 
   @Test
   public void testInjectAnnotations() {
	   SimpleBean beansemplice =  (SimpleBean)ctx.getBean("beansemplice");
	   //Iniezione di iniettato.java in  SimpleBean.java grazie all'annotazione
	   //@Inect e @Named in SimpleBean.java
	   log.info(beansemplice.getInjected().toString());
	   
   }
   
   
   @Test
   public void testValueAnnotations() {
	   SimpleBean beansemplice =  (SimpleBean)ctx.getBean("beansemplice");
	    //val e' iniettato da @Value("#{systemEnvironment.JAVA_HOME}")
	   log.info(beansemplice.getInjected().getVal());
	   
   }

   
	   
}


