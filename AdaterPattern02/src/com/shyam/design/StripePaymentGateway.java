package com.shyam.design;

public class StripePaymentGateway {
public void makeTransaction(double amountInCents,String currencyCode) {
	System.out.println("Stripe Transaction: "+amountInCents+" cents in "+currencyCode);
}
}
