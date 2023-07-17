package com.learn.oops.abstraction;

public class Tesla extends Car{

	@Override
	public void engine() {
		System.out.println("I am implementing tesla engine");
	}

	@Override
	public void accelerator() {
		System.out.println("Tesla is using own accelarator machanicm ");
	}



}
