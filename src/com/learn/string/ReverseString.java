package com.learn.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "javaProgramingsdfghjkl;'"
				+ "';lkjhgfdsfghjkl;'"
				+ "';lkjhgfdghjkl;'"
				+ "';lkjhgffghjkl;'"
				+ "';lkjhgfdghjkl;'";
		System.out.println(str.length());
		String reverse = "";
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			reverse = c+reverse; // "" /j /  aj/ vaj/ avaj/ Pavaj/ rPavaj/ orPavaj/ gorPavaj/ rgorPavaj
		}
		
		System.out.println(reverse);
		
		String newReverse = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			char c = str.charAt(i);
			newReverse = newReverse + c;
		}
		
		if(str.equals(newReverse)) {
			System.out.println("its palindrome");
		}
	}
}
