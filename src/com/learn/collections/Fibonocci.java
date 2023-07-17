package com.learn.collections;

public class Fibonocci {
	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13.........
		//n1=1  n2 =2 n3=1+1  
		int n1=0, n2=1, n3;
		System.out.print(n1 +", "+n2);
		for(int i=2; i<15; i++) {
			n3 = n1+n2; //0+1 =1
			System.out.print(", "+n3);
			n1= n2;
			n2=n3;
		}
	}
}	
