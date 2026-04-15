package com.shyam.design;

public class BigWheel extends Car {

	private final Product product;
	private final String carType;
	public BigWheel(Product product,String carType) {
		super(product,carType);
		this.product = product;
		this.carType = carType;
	}

	@Override
	public void assemble() {
		System.out.println("Assembling " + product.productName() + " according to " + carType);
	}

	@Override
	public void produceProduct() {
		product.produce();
		System.out.println("Modifying product " + product.productName() + " for " + carType);
	}
	
	

}
