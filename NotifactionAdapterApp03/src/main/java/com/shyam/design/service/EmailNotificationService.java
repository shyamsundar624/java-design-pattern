package com.shyam.design.service;

import org.springframework.stereotype.Service;

@Service("emailSender")
public class EmailNotificationService implements NotificationSender {

	@Override
	public void send(String recipient, String message) {
		// Simulate sending an email notification
		System.out.println("Sending Email to " + recipient + ": " + message);
	}

}
