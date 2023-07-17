package com.learn.oops.abstraction;

public class PaymentDemo {
	public static void main(String[] args) {
		
		Payment debit = new DebitCardPayment();
		debit.payment();
		
		Payment nP = new NewPayment();
		nP.payment();
	}
}
