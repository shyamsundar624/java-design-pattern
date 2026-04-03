package com.shyam.design.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NotificationService {

	public void sendConfirmationEmail(String email,Long orderId,double amount) {
		log.info("Sending confirmation email to {} for order {} with amount ${}", email, orderId, amount);
		// In real implementation, integrate with email service here
		log.info("Confirmation email sent successfully to {}", email);
	}
}
