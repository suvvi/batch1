package com.learn.oops.abstraction;

public class BMW extends Car{

	@Override
	public void engine() {
		System.out.println("I am implementing BMW engine");
	}

	@Override
	public void accelerator() {
		System.out.println("BMW is using own accelarator machanicm ");
	}


}
