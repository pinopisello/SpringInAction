package com.apress.coupling;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExampleContextXml extends TestCase {
   public void testConfigFromXml() {
      
	  System.out.println("ss");
	  ApplicationContext bf =   (ApplicationContext)new ClassPathXmlApplicationContext("exampleContext.xml");

	  TightlyCoupled tight = (TightlyCoupled)bf.getBean("tightlyCoupled");
	   
	  SmtpImpl ff = (SmtpImpl)bf.getBean("smtp");
	   
      LooselyCoupled c1 = 
       (LooselyCoupled)bf.getBean("looseSmtp");
      c1.sendMessage();
      
      LooselyCoupled c3 =    (LooselyCoupled)bf.getBean("looseSmtp");
       c1.sendMessage();   
      
      LooselyCoupled c2 = 
        (LooselyCoupled)bf.getBean("looseSoap");
      c2.sendMessage();

   }
}
