package com.shyam.design;

import java.util.List;

//Composite: Represents a composite object that can have children (other composites or leaf objects). It implements the common interface and manages its children.
public class Manager implements Employee {
	private String name;
	private double salary;
	private List<Employee> team=new java.util.ArrayList<>();

	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
		
	}

	public void add(Employee employee) {
		team.add(employee);
	}

	public void remove(Employee employee) {
		team.remove(employee);
	}

	@Override
	public void showDetails(String indent) {
		System.out.println(indent + "Manager: " + name + 
				", Salary: " + salary);
		for (Employee subordinate : team) {
			subordinate.showDetails(indent + "    ");
		}
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		double totalSalary = salary;
		for (Employee subordinate : team) {
			totalSalary += subordinate.getSalary();
		}
		return totalSalary;
	}

}
