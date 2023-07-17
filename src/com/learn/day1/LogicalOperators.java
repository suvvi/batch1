package com.learn.day1;

public class LogicalOperators {
	public static void main(String[] args) {
		//Logical operators  && , || , !
		int x =18;
		System.out.println(x>5 && x<10); //F
		System.out.println(x>5 || x<10); //T
		
		
		int a= 10, b=29, c=30;
		
		System.out.println((a<b) && (b==c)); //t && f=f
		System.out.println((a<b) || (b==c)); // t || f =t
		
		
		System.out.println(!(a>c) || (++b == c)); // T || T
		
		System.out.println((b++ == c));
	}
}
