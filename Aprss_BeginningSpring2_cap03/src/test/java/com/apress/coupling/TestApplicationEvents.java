package com.apress.coupling;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.reference.cap3.EmailService;

public class TestApplicationEvents extends TestCase {
	   
	public void testApplicationEvents() {
		    BeanFactory bf =  new ClassPathXmlApplicationContext("testApplicationEvents.xml");
		    EmailService emailService = (EmailService)bf.getBean("emailService");
		    emailService.sendEmail("john@doe.org", "Ciao Pippo");    
	   }
}
