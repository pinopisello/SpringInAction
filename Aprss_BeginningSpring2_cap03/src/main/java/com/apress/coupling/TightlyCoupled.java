package com.apress.coupling;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class TightlyCoupled {
   private Transport transport = new SmtpImpl();
   
   @Autowired
   private ApplicationContext context;
   
   public TightlyCoupled(){
	   System.out.println("TightlyCoupled constr.");
   }
   
   public void sendMessage() {
      transport.send();
   }
   
   
   @PostConstruct
   public void postConstruct(){
	   System.out.println("TightlyCoupled @PostConstruct ");
   }
   
   @PreDestroy
   public void preDestroy(){
	   System.out.println("TightlyCoupled @PreDestroy ");
   }
   
   
}
