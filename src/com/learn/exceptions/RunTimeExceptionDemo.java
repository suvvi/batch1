package com.learn.exceptions;

import java.util.Scanner;

public class RunTimeExceptionDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			System.out.println("provide your number***********");
			String s = sc.next();
			System.out.println(Integer.parseInt(s));
			String s2= "ggghghg";
			System.out.println(s2.length());
			System.out.println("provide your 2 number***********");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a/b);
			System.out.println(s2.charAt(10));
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException in String interger conversion code");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException in String interger conversion code");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException in String interger conversion code");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException in String interger conversion code");
		}catch(Exception e) {
			System.out.println("SOmething happened in String interger conversion code");
		}
		
		sc.close();
		System.out.println("COde end");
	}
}
