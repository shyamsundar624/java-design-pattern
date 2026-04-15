package com.shyam.design;

public class EmailSender implements MessageSender {
	@Override
	public void sendMessage(String recipient, String subject, String body) {
		// Simulate sending an email
		System.out.println("---------------------------");
		System.out.println("Email Sent...");
		System.out.println("To " + recipient);
		System.out.println("Subject: " + subject);
		System.out.println("Body: " + body);
		System.out.println("----------------------------");
	}

	@Override
	public String getSenderType() {
		return "Email";
	}

}
