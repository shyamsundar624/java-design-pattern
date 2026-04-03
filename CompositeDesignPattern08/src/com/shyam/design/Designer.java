package com.shyam.design;
//LEAF: Represents leaf objects in the composition. A leaf has no children.
public class Designer implements Employee {
	private String name;
	private double salary;

	public Designer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void showDetails(String indent) {
		System.out.println(indent + "Designer: " + name + 
				", Salary: " + salary);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}

}
