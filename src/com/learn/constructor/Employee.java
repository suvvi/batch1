package com.learn.constructor;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private String depat;
	
	public Employee(int id, String name, int salary, String depat) {
		super(); //parent class constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.depat = depat;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepat() {
		return depat;
	}
	public void setDepat(String depat) {
		this.depat = depat;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", depat=" + depat + "]";
	}
}
