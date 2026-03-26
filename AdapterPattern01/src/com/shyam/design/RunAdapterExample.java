package com.shyam.design;

public class RunAdapterExample {
	public static void main(String[] args) {

Xpay xpay=new XpayImpl();
xpay.setCreditCardNo("343243434");
xpay.setCustomerName("Shyam sundar");
xpay.setCardExpMonth("09");
xpay.setCardExpYear("30");
xpay.setCardCVVNo((short)234);
	xpay.setAmount(34343434.44);
	
PayD adapter = new	XpayToPayDAdapter(xpay);

System.out.println(adapter.getCardExpMonthDate());
	}
}
