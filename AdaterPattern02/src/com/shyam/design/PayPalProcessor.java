package com.shyam.design;

public class PayPalProcessor implements PaymentProcessor {

	@Override
	public void processPayment(String currency, double amount) {
		System.out.println("Processing Via PayPal " + amount + " " + currency);
	}

}
