package com.learn.oop.inheritance;

public class OverLoading {
	public static void main(String[] args) { //overloading
		add(2);
		add(2.2f,3.4f);
		add(2,4);
		add(2,4,6);
	}
	
	public static void add(int a) {  //1
		int sum = a+a;
		System.out.println("My sum is ---"+sum);
	}
	
	public static void add(int a, int b) { //2
		int sum = a+b;
		System.out.println("My sum is ---"+sum);
	}
	
	
	public static void add(int a, int b, int c) {//3
		int sum = a+b+c;
		System.out.println("My sum is ---"+sum);
	}
	
	public static void add(float a, float b) {//4
		float sum = a+b;
		System.out.println("My sum is ---"+sum);
	}
}
