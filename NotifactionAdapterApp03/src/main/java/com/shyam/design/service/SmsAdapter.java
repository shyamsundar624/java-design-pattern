package com.shyam.design.service;

import org.springframework.stereotype.Service;

@Service("smsSender")
public class SmsAdapter implements NotificationSender {

	private final SmsGatewayService smsGatewayService;

	public SmsAdapter(SmsGatewayService smsGatewayService) {
		this.smsGatewayService = smsGatewayService;
	}

	@Override
	public void send(String recipient, String message) {
		// Assuming recipient is in the format "countryCode-phoneNumber"
		String[] parts = recipient.split("-");
		if (parts.length == 2) {
			String countryCode = parts[0];
			String phoneNumber = parts[1];
			smsGatewayService.dispatchSms(phoneNumber, countryCode, message);
		} else {
			System.out.println("Invalid recipient format for SMS: " + recipient);
		}
	}

}
