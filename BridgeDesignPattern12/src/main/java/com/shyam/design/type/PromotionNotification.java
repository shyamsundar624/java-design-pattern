package com.shyam.design.type;

import com.shyam.design.composite.MessageSender;

public class PromotionNotification extends Notification {

	public PromotionNotification(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send(String recipient, String message) {
		String subject = "Exclusive Promotion Just for You!";
		String body = "[Promotion] " + message + " | Don't miss out on this limited-time offer!";
		System.out.println("Sending Promotion via " + messageSender.getSenderType());
		messageSender.sendMessage(recipient, subject, body);

	}

	@Override
	public String getNotificationType() {
		return "Promotion Notification";
	}

}
