package com.learn.arrays;

public class MaxArray {
	public static void main(String[] args) {
		
		int[] arr = {244,523,34667,451,876,412,349,7610};
		
		int max = arr[0]; //244
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max----"+max);
	}
}
