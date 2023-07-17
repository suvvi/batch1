package com.learn.arrays;

import java.util.Arrays;

public class TargetSUm {
	public static void main(String[] args) {
		int[] arr = {1,2,7,8,9,12,7};
		int sum = 9;
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			int num1 = arr[i]; //1
			for(int j= i+1; j<arr.length ; j++) {
				int num2 = arr[j];
				if(num1+num2 == sum) {
					System.out.println(num1 + " "+num2);
					break;
				}
			}
		}
	}
}
