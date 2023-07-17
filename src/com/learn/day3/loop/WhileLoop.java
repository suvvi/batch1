package com.learn.day3.loop;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		
		/*
		for(int i=1;i<1000 ;i++) {
			System.out.println(i);
		}
		*/
		
		int i=1;  //declaration
		while(i<10) { //condition
			System.out.println(i); //code
			i++; //increment/decrement
		}
		

		Scanner sc = new Scanner(System.in);
		System.out.println("provide your number***********");
		int n = sc.nextInt();
		
		int fact =1;
		while(n>=1) {
			fact = fact*n;
			n--;
		}
		
		System.out.println("fact--"+fact);
	}
}
