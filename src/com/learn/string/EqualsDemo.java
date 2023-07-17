package com.learn.string;

public class EqualsDemo {
	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "java";
		
		//s1 = "java coding";
		
		//equals(content equality) AND == (memory location)
		
		System.out.println(s1.equals(s2)); //T
		System.out.println(s1==s2); //T
		
		String s3 = new String("java");
		System.out.println(s1.equals(s3)); //T
		System.out.println(s1==s3); //F
		
		String s4 = new String("java");  
		System.out.println(s4==s3); //F
		
		String s5 = s4;
		System.out.println(s4==s5); //T
		
		String s6 = new String(s4); 
		System.out.println(s4==s6);//F
	}
	
}
