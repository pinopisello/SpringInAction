package com.apress.coupling;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResourceAnnotation extends TestCase {
	  
	public void testConfigAutowiring() {
	      BeanFactory ctx =   new ClassPathXmlApplicationContext("testResourceAnnotation.xml");
	      ctx.getBean("simpleMovieLister");
	}
	    
}
