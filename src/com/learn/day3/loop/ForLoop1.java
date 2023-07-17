package com.learn.day3.loop;

import java.util.Scanner;

public class ForLoop1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("provide your number***********");
		int n = sc.nextInt();
		
	/*	for(int i=1; i<=n ; i=i+2) {
			System.out.println(i);
		}*/
		
		//1+2+3.....+9+10
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			//sum = sum +i; //3+3
			sum += i;
		}
		
		System.out.println("total===="+sum);
		
		//factorial  5*4*3*2*1
		
		int factorial =1;
		
		for(int i=n;i>1 ;i--) {
			factorial = factorial*i; //1*5*4*3*2
		}
		System.out.println("Factorial----"+factorial);
		
		for(int i=1;i<=n; i++) {
			System.out.println("helloooo**"+i);
		}
	}
}
