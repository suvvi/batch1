package com.learn.arrays;

public class ArraySum {
	public static void main(String[] args) {
		
		int[] arr = {2,5,6,1,8,4,9,10};
		
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum = sum +arr[i];
			if(checkeven(arr[i])) {
				System.out.println("I m even---"+arr[i]);
			}else {
				System.out.println("I m ODD---"+arr[i]);
			}
		}
		
		System.out.println("total is----"+sum);
	}
	
	public static boolean checkeven(int num) {
		if(num %2 ==0) {
			return true;
		}else {
			return false;
		}
	}
}
