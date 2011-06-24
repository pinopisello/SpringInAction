package com.apress.coupling;

import org.springframework.beans.factory.annotation.Autowired;

public class LooselyCoupled {
   private Transport transport;
   
   public LooselyCoupled() {}
   
   
   @Autowired
   public LooselyCoupled(final Transport foo) {
      this.transport = foo;
   }

   public void sendMessage() {
      transport.send();
   }
}
