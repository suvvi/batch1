package com.learn.exceptions;

public class MyException extends Exception { //custom exception
	String message;
	MyException(String m){
		this.message = m;
	}
	
	@Override
	public String toString() {
		return "MyException [message=" + message + "]";
	}
}
