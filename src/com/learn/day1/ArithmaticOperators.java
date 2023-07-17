package com.learn.day1;

public class ArithmaticOperators {
	public static void main(String[] args) {
		
		//Arithmetic operators -> +,-,*,/,%,++, --
		
		int sum = 100 + 20;
		System.out.println("sum ---"+sum);  //120
		
		int sum1 = sum + 30 ;
		System.out.println("sum1 ---"+sum1); //150
		
		int substract = sum1 - 30;
		System.out.println("substract ---"+substract); //120
		
		int multiply = sum1*30;
		System.out.println("multiply ---"+multiply); //4500
		
		int division = sum1 / 40;
		System.out.println("division ---"+division); //3
		
		int modulus = sum1 % 40;
		System.out.println("modulus ---"+modulus); //remainder 30
		
		//increment (++x / x++) & decrement (--x / x--)
		int x = ++sum; //1st increase then assign
		System.out.println("sum ---"+sum);  //121
		System.out.println("X----"+x);
		int y = x++; //1st assign then increase //y=121 x= 122
		System.out.println("y----"+y);
		System.out.println("X----"+x);
		
		y = --x; //y=121   x=121  
		y = x--; //y=121   x=120
		System.out.println("y----"+y);
		System.out.println("X----"+x);
		
		x += 3;  // x = x+3
		System.out.println("X----"+x); //123
		
		x *= 2; // x = x*2
		System.out.println("X----"+x); //246
		
		x /= 2 ; // x = x/2
		System.out.println("X----"+x); //123
	}
	
}
