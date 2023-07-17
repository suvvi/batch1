package com.learn.day3.loop;

import java.util.Scanner;

public class WhileLoop3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("provide your quantity");
		int quantity = sc.nextInt();
		System.out.println("provide your price");
		int price = sc.nextInt();
		
		int sum = 0;
		while(quantity>0 && price>=0) {
			sum = sum + (quantity * price);
			System.out.println("provide your quantity");
			quantity = sc.nextInt();
			System.out.println("provide your price");
			price = sc.nextInt();
		}
		
		System.out.println("total---"+sum);
		sc.close();
	}
}
