package com.shyam.design;

public class CheckoutService {
public void checkout(PaymentProcessor processor) {
	processor.processPayment("USD", 50.66);
}
public static void main(String[] args) {
	CheckoutService service=new CheckoutService();
	PaymentProcessor payPal=new PayPalProcessor();
	service.checkout(payPal);
	
	
	//Using Stripe Adapter
	StripePaymentGateway stripeGateway=new StripePaymentGateway();
	PaymentProcessor stripeAdapter=new StripeAdapter(stripeGateway);
	service.checkout(stripeAdapter);
	
}
}
