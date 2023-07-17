package com.learn.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowAndThrows {
	public static void main(String[] args) {
		try {
			readFile("fgh");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void readFile(String file) throws MyException {
		try {
			FileInputStream input = new FileInputStream("C:/abc.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found issue came---");
			throw new MyException("Issue in file code");
		}
	}
}
