package com.learn.oop.inheritance;

public class Area {
	public static void main(String[] args) {
		area(5);
		area(5,7);
		area(5.1f);
		Car.test();
	}
	
	public static void area(int l) {
		int a = l*l;
		System.out.println("area of square is --"+a);
	}
	
	public static void area(int l, int w) {
		int a = l*w;
		System.out.println("area of ractangle is --"+a);
	}
	
	public static void area(float r) {
		float a = 3.14f*r*r;
		System.out.println("area of circle is --"+a);
	}
}
