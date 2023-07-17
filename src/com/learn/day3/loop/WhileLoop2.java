package com.learn.day3.loop;

import java.util.Scanner;

public class WhileLoop2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("provide your number***********");
		int n = sc.nextInt();
		
		
		int sum = 0;
		while(n>=0) {
			sum += n;
			System.out.println("provide your new number***********");
			n = sc.nextInt();
		}
		
		System.out.println("total---"+sum);
	}
}
