package com.learn.arrays;

public class ArrayDemo {
	//collection of similar type of data
	public static void main(String[] args) {
		
		//declaration  instantiation //initialization 
		int marks[] = new int[5]; //0-4
		
		String[] students = new String[5]; //array of string holding 5 values
		
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		marks[4] = 50;
		
		System.out.println("lngth-----"+marks.length);
		
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		for(int i=marks.length-1; i>=0 ;i--) { //reverse printing
			System.out.println("reverse order----"+marks[i]);
		}
	}
}
