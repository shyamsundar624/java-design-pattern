package com.shyam.design;

public class CentralLocking implements Product {
	private final String productName;
	
	public CentralLocking(String productName) {
		this.productName = productName;
	}

	@Override
	public String productName() {
		return "Central Locking";
	}

	@Override
	public void produce() {
		System.out.println("Producing Central Locking System for " + productName);
	}

}
