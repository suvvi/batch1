package com.learn.string;

public class StringDemo {
	public static void main(String[] args) {
		
		String str = "Tuppl"; //creating string literal /immutable /String constant pool
		System.out.println(str);
		
		str = "Tuppl Technologies";
		System.out.println(str);
		
		str = "Tuppl Technologies Texas";
		String str1 = "Tuppl"; 
		
		String str2 = "Tuppl Technologies";
		str2  = "Tuppl Technologies Texas";
		System.out.println(str2.length());
		System.out.println(str2.charAt(5)); //starts from 0
		int a=10;
		 a=20;
		 
		String st = new String("Tuppl"); //
		st = "Tuppl Technologies";
		
		String st1 = new String("Tuppl Technologies");
	}
}
