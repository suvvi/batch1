package com.learn.oop.inheritance;

public class VehicleDemo {
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.brand("Nissan");
		
		Car c = new Car();
		c.brand("BMW");
		c.seats(4);
		c.name("BMW");
		//System.out.println(c);
		
		Bike b = new Bike();
		
		Honda h = new Honda();
		h.seats(4);
		h.speed(2000);
		h.brand("Honda");
	}
}
