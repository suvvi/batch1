package com.learn.exceptions;

import java.util.Scanner;

public class FinallyDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("provide your number***********");
			String s = sc.next();
			//System.exit(0);
			System.out.println(Integer.parseInt(s));
			String s2= "ggghghg";
			System.out.println(s2.length());
			System.out.println("provide your 2 number***********");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a/b);
			System.out.println(s2.charAt(10));
			
		}catch(NumberFormatException e) {
			System.out.println("Exception*******");
		}finally {
			sc.close();
			System.out.println("I am always called**********");
		}
		
		System.out.println("EOD");
	}
}
