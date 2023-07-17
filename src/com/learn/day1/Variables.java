package com.learn.day1;

public class Variables {
	static short shortData = 20000; //class level
	
	public static void main(String[] args) {
		//type name = value
		System.out.println("my short value before changes is --"+shortData);
		
		int myNum = 598765432;  //Integer (whole numbers) 4bytes
		long myLong = 5987654329l;  //8 byte
		float myFloat = 5.6f;
		//shortData = 6666;
		String name = "testing";
		char character = 'A';
		boolean bool = true;
		System.out.println("my short value is --"+shortData);
		System.out.println("my integer value is --"+myNum); //
		System.out.println("my float value is --"+myFloat+" And my long value is -"+myLong);
		test();
	}
	
	public static  void test() {
		int myNum = 4444;
		shortData = 7777;
		System.out.println("my short value in test method is --"+shortData);
		System.out.println("my integer value in test method is --"+myNum); //
	}
}
