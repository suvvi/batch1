package com.learn.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	public static void main(String[] args) {
		readFile("c:/abc.txt");
		
		try {
			readMyFile("c:/abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void readFile(String file) {
		try {
			FileInputStream input = new FileInputStream("C:/abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println("exception in my code");
		}
	}
	
	public static void readMyFile(String file) throws FileNotFoundException { //throws -> i am re throwing the exception caller of method ll take care
		FileInputStream input = new FileInputStream(file);
	}
}
