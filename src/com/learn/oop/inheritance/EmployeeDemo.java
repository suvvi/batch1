package com.learn.oop.inheritance;

public class EmployeeDemo {
	public static void main(String[] args) {//RunTime Polymorphism
		
		Employee e = new Employee();
		e.home();

		Employee e1 = new ItEmployee();
		e1.home();
		
		Employee e2 = new HealthEmployee();
		e2.home();
		
		ItEmployee it = new ItEmployee();
		it.dept();
	}
}
