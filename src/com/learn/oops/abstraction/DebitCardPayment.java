package com.learn.oops.abstraction;

public class DebitCardPayment extends Payment{

	@Override
	public void payment() {
		System.out.println("its debit card payment");
	}

}
