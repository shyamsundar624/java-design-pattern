package com.shyam.design;

public class GearLocking implements Product {
	private final String productName;
	
	public GearLocking(String productName) {
		this.productName = productName;
	}

	@Override
	public String productName() {
		return "Gear Locking";
	}

	@Override
	public void produce() {
		System.out.println("Producing Gear Locking System for " + productName);
	}

}
