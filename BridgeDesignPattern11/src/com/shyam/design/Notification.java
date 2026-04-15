package com.shyam.design;

//The "What" Side- holds a reference to the implementor
//This is the BRIDGE - it delegates actual sending to the Implementor
public abstract class Notification {

	//THE BRIDGE - reference to the implementor
	protected MessageSender messageSender;

	public Notification(MessageSender messageSender) {
		this.messageSender = messageSender;
	}
	
	//swap channel at runtime
	public void setSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	public abstract void send(String recipient, String message);
	
	public abstract String getNotificationType();
}
