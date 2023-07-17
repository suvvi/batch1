package com.learn.day2;

import java.util.Scanner;

public class IfCondition2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the marks");
		int marks = sc.nextInt();
		
		System.out.println("please enter the name");
		String name = sc.next();
		
		//>60 = 1st / 50-60 =2nd / 40-50 = 3rd / fail
		
		if(marks >= 60) {
			System.out.println(name + " you scored 1st");
		}else if(marks >= 50 && marks < 60) {
			System.out.println(name + " you scored 2nd");
		}else if(marks >= 40 && marks < 50) {
			System.out.println(name + " you scored 3rd");
		}else {
			System.out.println(name + " you scored Fail");
		}
		
	}
}
