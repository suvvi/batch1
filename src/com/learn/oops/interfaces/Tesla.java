package com.learn.oops.interfaces;

public class Tesla implements MyInterface{

	@Override
	public void breaks() {
		System.out.println(" my car Tesla is using breaks");
	}

	@Override
	public void engine() {
		System.out.println(" my car tesla is using engine");
	}

	public void seats(int s) {
		System.out.println(" my car is using seats--"+s);	
	}
}
