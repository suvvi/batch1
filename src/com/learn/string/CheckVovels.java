package com.learn.string;

public class CheckVovels {
	
	public static void main(String[] args) {
		String str = "javaProgramingu"; //0-13
		str = str.toLowerCase();
		
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			if(checkVovels(c)) {
				System.out.println(c);
			}
		}
	}
	
	public static boolean checkVovels(char c) {
		// a e i o u 
		if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' ) {
			return true;
		}else {
			return false;
		}
		
	}
}
