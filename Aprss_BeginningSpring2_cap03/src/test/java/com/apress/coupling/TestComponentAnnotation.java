package com.apress.coupling;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponentAnnotation extends TestCase {

	   public void testComponentAnnotation() {
	       BeanFactory ctx =   new ClassPathXmlApplicationContext("testComponentAnnotation.xml");//Autowire con classi annotate @Autowired
	      
	   }
	}

