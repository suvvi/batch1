package com.learn.arrays;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,3,4,5,5};
		int l = arr.length;
		int count =0;
		for(int i=0; i<l; i++) {
			
			if(i<l-1 && arr[i]==arr[i+1]) {
				count++;
				System.out.println(arr[i+1]);
			}
		}
		System.out.println(count);
	}
	
}
