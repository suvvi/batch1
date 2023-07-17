package com.learn.arrays;

public class SecondHighestInArray {
	public static void main(String[] args) {
		int[] arr = {244,200,523,34667,451,876,412,349,7610};
		
		int first =arr[0]; //244
		int second = first; //244
		
		for(int i=0; i<arr.length; i++) {
			int num = arr[i]; //523
			if(num >first) {
				second = first; // s=876
				first = num;  //f=34667
			}else if(num>second) {
				second = num; //s=7610
			}
		}
		System.out.println("1st---"+first);
		System.out.println("2nd----"+second);
			
		String str = "dfghjklkjhgfdfghjk";
		char[] a = str.toCharArray();
	}
}
