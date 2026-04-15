package com.shyam.design;

public abstract class Car {

	private final Product product;
	private final String carType;
	
	public Car(Product product, String carType) {
		this.product = product;
		this.carType = carType;
	}
	
	public abstract void assemble();
	public abstract void produceProduct();
	
	public void printDetails() {
		System.out.println("Car Type: " + carType+", Product: " + product.productName());
	}
}
