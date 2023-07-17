package com.learn.string;

public class StringOperation {
	public static void main(String[] args) {
		
		String str = "javaPrograming"; //0-13
		System.out.println(str.charAt(20));
		System.out.println("Length ---"+str.length());
		
		System.out.println("char index ---"+str.charAt(5));
		
		System.out.println("Substring----"+str.substring(5)); //rograming
		System.out.println("Substring----"+str.substring(5,10)); //rogra  5-9
		
		System.out.println("concat---"+str.concat("I like"));
		
		System.out.println("Replace---"+str.replace('a', 'A'));
		
		String s = "       jack,mack,pack,rack";
		s = s.trim();
		System.out.println(s.split(","));
		
		
		
	}
}
