package com.apress.coupling;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanFactoryInterface extends TestCase {
   public void testTestBeanFactoryInterface() {
	   ApplicationContext bf =  new ClassPathXmlApplicationContext("beanFactoryLifeCycle.xml");
	   SpringBeansInterfacesDummy dummy = (SpringBeansInterfacesDummy)bf.getBean("dummy");
	      
	   System.out.println("Finito!");
   }
}
