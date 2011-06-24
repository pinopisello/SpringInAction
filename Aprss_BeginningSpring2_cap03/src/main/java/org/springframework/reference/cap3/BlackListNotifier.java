package org.springframework.reference.cap3;

import org.springframework.context.ApplicationListener;

public class BlackListNotifier implements ApplicationListener<BlackListEvent> {
	private String notificationAddress;
	
	public void setNotificationAddress(String notificationAddress) {
	this.notificationAddress = notificationAddress;
	}
	public void onApplicationEvent(BlackListEvent event) {
	  System.out.println("BlackListNotifier.onApplicationEvent("+event.getAddress()+":"+event.getTest()+")");
	}
}
