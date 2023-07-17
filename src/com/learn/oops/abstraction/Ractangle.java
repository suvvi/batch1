package com.learn.oops.abstraction;

import java.util.Scanner;

public class Ractangle extends Shape{
	private int l;
	private int w;
	
	@Override
	public void area() {
		getInput();
		int area = l*w;
		System.out.println("area of Ractangle is ----"+area);
	}

	@Override
	public void perimeter() {
		int p = l*2+w*2;
		System.out.println("Perimeter of Ractangle is ----"+p);
	}

	public void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is the lenght of Ractangle");
		 l = sc.nextInt();
		System.out.println("what is the width of Ractangle");
		 w = sc.nextInt();
	}
}
