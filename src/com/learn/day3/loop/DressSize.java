package com.learn.day3.loop;

import java.util.Scanner;

public class DressSize {
	
	public static void main(String[] args) {
		//Switch Case -> X, S, M, L
		Scanner sc = new Scanner(System.in);
		System.out.println("provide which size you are looking for***********");
		String size = sc.next();
		
		DressSize myObj = new DressSize();
		myObj.calculateSize(size);
	}
	
	public void calculateSize(String size) {
		switch(size) {
		case "X":
			System.out.println("this is extra small ");
			break;
		case "S":
			System.out.println("this is small ");
			break;
		case "M":
			System.out.println("this is Medium ");
			break;
		case "L":
			System.out.println("this is Large ");
			break;
		case "XL":
			System.out.println("this is Large ");
			break;
		default:
			System.out.println("this is not valid size");
	}
	}
}
