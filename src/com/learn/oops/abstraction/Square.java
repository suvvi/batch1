package com.learn.oops.abstraction;

import java.util.Scanner;

public class Square extends Shape{
	private int l; //global
	
	@Override
	public void area() {
		getData();
		int area = l*l;
		System.out.println("area of square is ----"+area);
	}

	@Override
	public void perimeter() {
		int p = l*4;
		System.out.println("Perimeter of square is ----"+p);
	}
	
	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is the lenght of square");
		l = sc.nextInt(); //local
	}

}
