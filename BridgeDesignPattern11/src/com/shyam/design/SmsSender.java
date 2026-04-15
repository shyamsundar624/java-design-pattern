package com.shyam.design;

public class SmsSender implements MessageSender {
	@Override
	public void sendMessage(String recipient, String subject, String body) {
		// Simulate sending an SMS
		System.out.println("---------------------------");
		System.out.println("SMS Sent...");
		System.out.println("Phone " + recipient);
		System.out.println("Subject: " + subject);
		//SMS is Short
		System.out.println("Body: " + body.substring(0, Math.min(body.length(), 50)) + "...");
		System.out.println("----------------------------");
	}

	@Override
	public String getSenderType() {
		return "SMS";
	}

}
