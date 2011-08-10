package com.apress.coupling;

import org.springframework.beans.factory.annotation.Autowired;

public class LooselyCoupled {
bla bla
   private Transport transport;
 vv
   public LooselyCoupled() {}
   
   
   @Autowired
   public LooselyCoupled(final Transport foo) {
      this.transport = foo;
   }

   public void sendMessage() {
      transport.send();
   }
}
