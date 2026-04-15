package com.shyam.design;

public class TestBridgePattern {
public static void main(String[] args) {
	Product product1=new CentralLocking("Central Locking System");
	Product product2=new GearLocking("Gear Locking System");
	
	
	Car car=new BigWheel(product1, "BigWhell zx model");

	car.produceProduct();
	car.assemble();
	car.printDetails();
	
	System.out.println("--------------------------------------------------");
	
	Car car2=new BigWheel(product2, "BigWhell zx2 model");
	car2.produceProduct();
	car2.assemble();
	car2.printDetails();
	
	
	System.out.println("--------------------------------------------------");
	
	Car car3=new Motoren(product1, "Motoren zx model");
	car3.produceProduct();
	car3.assemble();
	car3.printDetails();
}
}
