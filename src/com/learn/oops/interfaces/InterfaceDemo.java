package com.learn.oops.interfaces;

public class InterfaceDemo {
	public static void main(String[] args) {
		
		MyInterface toyota = new Toyota();
		//toyota.price =20;
		
		MyInterface tesla = new Tesla();
		tesla.breaks();
		
		Tesla ts = new Tesla();
		ts.seats(3);
	}
}
