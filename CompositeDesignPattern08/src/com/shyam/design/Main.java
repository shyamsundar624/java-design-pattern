package com.shyam.design;

public class Main {
public static void main(String[] args) {
	// Create leaf objects
	Employee dev1 = new Developer("Alice", 80000, "Java");
	Employee dev2 = new Developer("Bob", 75000, "Python");
	Employee dev3 = new Developer("Eve", 72000, "JavaScript");
	Employee des1 = new Designer("Charlie", 70000);
	
	
	//Composite: Manager with a small team
	Manager backendMgr = new Manager("David", 90000);
	backendMgr.add(dev1);
	backendMgr.add(dev3);
	
	
	Manager frontendMgr = new Manager("Frank", 85000);
	frontendMgr.add(dev2);	
	frontendMgr.add(des1);
	
	//Composite: Top-level manager with two teams
	Manager generalMgr = new Manager("Grace (Senior Manager)", 120000);
	generalMgr.add(backendMgr);
	generalMgr.add(frontendMgr);
	
	System.out.println("Organization Structure:");
	generalMgr.showDetails("");
	
	System.out.println("\n  ==== Total TEAM Cost =====");
	System.out.println("Total Salary Cost for " + generalMgr.getName() + ": $" + generalMgr.getSalary());
	
}
}
