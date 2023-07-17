package com.learn.constructor;

public class EmployeeDemo {
	public static void main(String[] args) {
		
		Employee emp = new Employee(1,"jack",199,"IT");
		System.out.println(emp);
		
		Employee emp2 = new Employee(2,"jill",1990,"Health");
		System.out.println(emp2);
		System.out.println(emp2.getName());
	}
}
