package com.shyam.design;

public class PushNotificationSender implements MessageSender {
	@Override
	public void sendMessage(String recipient, String subject, String body) {
		// Simulate sending a push notification
		System.out.println("---------------------------");
		System.out.println("Push Notification Sent...");
		System.out.println("Device " + recipient);
		System.out.println("Title: " + subject);
		System.out.println("Preview: " + body.substring(0, Math.min(body.length(), 30)) + "...");
		System.out.println("----------------------------");
	}

	@Override
	public String getSenderType() {
		return "Push";
	}

}
