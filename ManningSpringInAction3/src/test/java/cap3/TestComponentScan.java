package cap3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.CommonTestCase;

public class TestComponentScan extends CommonTestCase{
	
	
	@BeforeClass
	public static void setup(){
		  ctx =   new ClassPathXmlApplicationContext("classpath:cap3/testComponentScan.xml");  
		  log.info("TestComponentScan setup");
	}
	
	
	@AfterClass
	public static void cleanup(){
		log.info("TestComponentScan cleanup");
	}
	
	@Test
	public void testComponentAnnotations() {
		Instrument guitar = (Instrument)ctx.getBean("chitarra");
		guitar.play();
	}
	
	
}
