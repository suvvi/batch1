package com.learn.day2;

import java.util.Scanner;

public class IfCondition {
	
	public static void main(String[] args) {
		
		/*
		 * if(condition) { write code what you wana do }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the age");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("you can vote as ur age is ---"+age);
		}else {
			System.out.println("you cannot vote as ur age is ---"+age);
		}
	}
}
