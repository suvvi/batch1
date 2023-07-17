package com.learn.oops.keywords;

public class StaticDemo {
	
	
	{
		System.out.println("This is my NOn static block 11");
	}
	{
		System.out.println("This is my NOn static block 222");
	}
	

	static{
		System.out.println("This is my static block 111");
	}
	static{
		System.out.println("This is my static block 222");
	}
	public static void main(String[] args) {
		
		StaticDemo st1 = new StaticDemo();
		st1.test();
		
		StaticDemo st2 = new StaticDemo();
		st2.test();
		StaticDemo st3 = new StaticDemo();
		
		Math.abs(100);
	}
	
	public void test() {
		System.out.println("I m calling test method");
	}
}
