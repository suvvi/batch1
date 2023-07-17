package com.learn.oop.inheritance;

public class Car extends Vehicle{
	
	public void seats(int s) {
		System.out.println("My Car have -- "+s + " seats");
	}
	
	@Override
	public void brand(String brand) {
		System.out.println("My new Car brand is ---"+brand);
	}
	
	public static void test() {
		System.out.println("My Car have test method ");
	}
}
