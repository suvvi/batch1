package com.learn.day2;

import java.util.Scanner;

public class IfCondition1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the marks");
		int marks = sc.nextInt();
		
		if(marks > 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		System.out.println("done");
	}
}
