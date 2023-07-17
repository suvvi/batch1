package com.learn.oops.interfaces;

import com.learn.oops.keywords.Animal;

public class Toyota implements MyInterface, Car {

	@Override
	public void breaks() {
		System.out.println(" my car is using breaks");
		
	}

	@Override
	public void engine() {
		System.out.println(" my car is using engine");
	}

	@Override
	public void seats(int s) {
		System.out.println(" my car is using seats--"+s);	
	}

	@Override
	public void color(String c) {
		System.out.println("My car is having color ---"+c);
	}

}
