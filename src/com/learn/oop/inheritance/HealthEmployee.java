package com.learn.oop.inheritance;

public class HealthEmployee extends Employee{
	
	@Override
	public void home() {
		System.out.println("Health department is located in NYC");
	}
	
	
	public void test() {
		System.out.println("It department lives in Texas");
	}
}
