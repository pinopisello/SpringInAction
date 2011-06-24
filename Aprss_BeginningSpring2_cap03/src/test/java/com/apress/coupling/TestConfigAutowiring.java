package com.apress.coupling;

import java.util.Collection;

import junit.framework.TestCase;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConfigAutowiring extends TestCase {
   //@SuppressWarnings("unchecked")
   public void testConfigAutowiring() {
      final ListableBeanFactory ctx = 
         //new ClassPathXmlApplicationContext("testConfigAutowiring.xml");
         new ClassPathXmlApplicationContext("testConfigAutowiring2.xml");//Autowire con classi annotate @Autowired
      final Collection<LooselyCoupled> beans  = (Collection<LooselyCoupled>)
               ctx.getBeansOfType(LooselyCoupled.class).values();
      for( final LooselyCoupled bean : beans ) {
         bean.sendMessage();
      }
   }
}
