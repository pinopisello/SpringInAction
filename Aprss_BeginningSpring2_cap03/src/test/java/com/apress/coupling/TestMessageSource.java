package com.apress.coupling;

import java.util.Locale;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.reference.cap3.Example;

public class TestMessageSource extends TestCase {
	   
	
	public void testMessageSource() {
		MessageSource resources = new ClassPathXmlApplicationContext("testMessageSource.xml");
		//Messaggio senza locale specificato [da exceptions.properties]
		String message = resources.getMessage("message", null, "Default", null);
		System.out.println(message);
		
		//Messaggio con Loale specifico [da exceptions.properties_en_GB]
		message = resources.getMessage("argument.required",
				new Object [] {"userDao"}, "Required", Locale.UK);
		System.out.println(message);
			
		
		
		BeanFactory bf = (BeanFactory)resources;
		Example example  = (Example)bf.getBean("example");
		example.execute();
		
		
		
 }
}

