package com.learn.day4;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("provide your number***********");
		int day = sc.nextInt();
		
		/*if(==1) {
			System.out.println("MON");
		}else if(n==2) {
			System.out.println("TUE");
		}
		
		*/
		switch(day) {
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("Tues");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
			case 7:
				System.out.println("SUN");
				break;
			default:
				System.out.println("Wrong input");
		}
	}
}
