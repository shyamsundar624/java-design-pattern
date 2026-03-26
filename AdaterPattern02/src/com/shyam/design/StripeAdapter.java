package com.shyam.design;

public class StripeAdapter implements PaymentProcessor {
	private StripePaymentGateway stripeGateway;

	public StripeAdapter(StripePaymentGateway striepGateway) {
		this.stripeGateway = striepGateway;
	}

	@Override
	public void processPayment(String currency, double amount) {
		//Convert dollars -> cents
		double amountIncents=amount*100;
		stripeGateway.makeTransaction(amountIncents, currency);

	}

}
