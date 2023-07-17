package com.learn.constructor;

import java.util.Scanner;

public class AnimalDemo {
	
	public static void main(String[] args) {
		Cat c = new Cat(2,"puppy");
		
		Cat c1 = new Cat(2,"puppy","black");
		Scanner sc = new Scanner (System.in );
			  
			  
			  try {
			  System.out.println("Provide your number*****");
			  int a = sc.nextInt(); 
			  System.out.println("Square of number ---"+a*a);
			  
			  }catch(Exception e) {
			   System.out.println("this is an exception");
			  }
			  
			  
			  System.out.println("Provide your data");
			  String d = sc.next ();
			  System.out.println(Integer.parseInt(d));
			 
	}
}
