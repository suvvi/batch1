package com.learn.oops.abstraction;

public class CarDemo {
	public static void main(String[] args) {
		
		//Car c = new Car(); if class is abstract you cannot create the object
		
		Car ts = new Tesla();
		//ts.price =30;
		ts.seats(2);
		ts.colour("White");
		ts.engine();
		ts.accelerator();
		
		Car bmw = new BMW();
		bmw.seats(4);
		bmw.colour("Black");
		bmw.engine();
		bmw.accelerator();
		
		//Payment p = new Payment();
	}
}
