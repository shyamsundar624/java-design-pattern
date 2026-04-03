package com.shyam.design.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PaymentService {

	public boolean processPayment(Long customerId, double amount) {
		// Simulate payment processing
		log.info("Processing payment of ${} for customer {}", amount, customerId);
		// In real implementation, integrate with payment gateway here
		log.info("Payment processed successfully for customer {}", customerId);
	
		return true;
		}
}
