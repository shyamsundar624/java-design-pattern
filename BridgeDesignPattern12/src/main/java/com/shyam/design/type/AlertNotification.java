package com.shyam.design.type;

import com.shyam.design.composite.MessageSender;

public class AlertNotification extends Notification {

	public AlertNotification(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send(String recipient, String message) {
		String subject = "ALERT: Immediate Attention Required!";
		String body = "[Alert] " + message + " | Please take immediate action";
		System.out.println("Sending Alert via " + messageSender.getSenderType());
		messageSender.sendMessage(recipient, subject, body);

	}

	@Override
	public String getNotificationType() {
		return "Alert Notification";
	}

}
