package com.learn.day4;

import java.util.Scanner;

public class LearnMethods {
	
	public static void main(String[] args) {
		
		Calculator myObject = new Calculator(); //myObject is the object of calculator class
		Scanner sc = new Scanner(System.in);
		System.out.println("provide your 1st number***********");
		int a = sc.nextInt();
		System.out.println("provide your 2nd number***********");
		int b = sc.nextInt();

		System.out.println("ADD---"+myObject.add(a,b));
		System.out.println("substract---"+myObject.substract(a,b));
		System.out.println("multiply---"+myObject.multiply(a,b));
		System.out.println("devision---"+myObject.devision(a,b));
		
		System.out.println("factorial of-"+a +" is "+myObject.factorial(a));
		System.out.println("factorial of-"+b +" is "+myObject.factorial(b)); 
		
	}
	
	/*accessModifier 	returnType		methodName(input parameters/arguments){
			//Method Body
		}*/	
	
	private static void printData() {
		for(int i=1;i<1000 ;i++) {
			System.out.println(i);
		}
	}
	
	public static String ship(int fZip, int tZip) {
		Calculator ca = new Calculator(); 
		String message = "";
		if(ca.substract(fZip, tZip) >10) {
			message = "your shiiping charges are 10$ and can ship on wednesday";
		}else {
			message = "your shiiping charges are 20$ and can ship on sunday";
		}
		return message;
	}
}
