package com.learn.day4;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("provide your 1st number***********");
		int a = sc.nextInt();
		System.out.println("provide your 2nd number***********");
		int b = sc.nextInt();

		System.out.println("ADD---"+add(a,b));
		System.out.println("substract---"+substract(a,b));
		System.out.println("multiply---"+multiply(a,b));
		System.out.println("devision---"+devision(a,b));
		
		System.out.println("factorial of-"+a +" is "+factorial(a));
		System.out.println("factorial of-"+b +" is "+factorial(b));
		sc.close();
		
	}
	
	public static int factorial(int a) {
		int fact = 1;
		for(int i=a; i>1; i--) {
			fact = fact*i;
		}
		return fact;
	}
	
	 public static int add(int a, int b){
		//int c = a+b;
		return a+b;
	}
	 
	 public static int substract(int a, int b){
		 return a-b;
	 }
	 
	 public static int multiply(int a, int b){
		 return a*b;
	 }
	 public static int devision(int a, int b){
		 return a/b;
	 }
}
