package com.learn.oops.abstraction;

public abstract class Shape {
	//color,sides, area,peremeter
	
	public void color(String color) {
		System.out.println(color);
	}
	
	public void sides(int s) {
		System.out.println(s);
	}
	
	public abstract void area();
	
	public abstract void perimeter();
}
