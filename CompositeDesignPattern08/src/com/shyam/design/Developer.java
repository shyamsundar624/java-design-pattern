package com.shyam.design;

//LEAF: Represents leaf objects in the composition. A leaf has no children.
public class Developer implements Employee {
	private String name;
	private double salary;
	private String skill;

	public Developer(String name, double salary, String skill) {
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}

	@Override
	public void showDetails(String indent) {
		System.out.println(indent + "Developer: " + name + 
				", Skill: " + skill +
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
