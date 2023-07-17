package com.learn.exceptions;

import java.io.File;
import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("provide your number***********");
		int a = sc.nextInt();
		
		System.out.println("square of number ----"+a*a);
		System.out.println("provide your data***********");
		String str = sc.next();
		System.out.println(str.charAt(5));
		
		String s = null;
		System.out.println(s.length());
		
		File f = new File("Tuppl.txt");
		
		//f.createNewFile();
	}
}
