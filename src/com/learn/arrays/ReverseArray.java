package com.learn.arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("array size ---");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("give me number---");
			arr[i]= sc.nextInt();
		}
		
		reverseArray(arr);
	}
	
	public static void reverseArray(int[] arr) { //2 3 4 5 7
		int[] reverse = new int[arr.length];
		int count =0;
		
		for(int i= arr.length-1; i>=0; i--) { //
			reverse[count++] = arr[i];
		}
		
		for(int i=0; i<reverse.length; i++) {
			System.out.println(reverse[i]);
		}
	}
}
