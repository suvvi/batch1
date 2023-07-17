package com.learn.exceptions;

public class ExceptionsDemo {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b =0;
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException is there");
		}
		
		try {
			String str = "123www";
			int n = Integer.parseInt(str);
			System.out.println("my integer is ---"+n);
			System.out.println("5th index ---"+str.charAt(5));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException is there");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException is there");
		}catch(Exception e) {
			System.out.println("Exception is there");
		}
		
		try {
			String st = null;
			System.out.println("length is ----"+st.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException is there");
		}
		System.out.println("EOD");
	}
}
