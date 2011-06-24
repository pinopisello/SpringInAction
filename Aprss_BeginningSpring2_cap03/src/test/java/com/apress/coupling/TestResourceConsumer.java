package com.apress.coupling;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResourceConsumer extends TestCase {
    
	public void testResourceConsumer() throws Exception{
	 ApplicationContext bf =  new ClassPathXmlApplicationContext("testResourceConsumer.xml");
	 ResourceConsumer rc =   (ResourceConsumer)bf.getBean("describer");
	 rc.describeResources();
	}
 
}
