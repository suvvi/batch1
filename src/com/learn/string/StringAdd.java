package com.learn.string;

public class StringAdd {
	public static void main(String[] args) {
		
		String str = "javaPrograming";
		//StringBuffer OR StringBuilder ->
		StringBuffer b = new StringBuffer(); //Synchronised And Slow
		
		for(int i= str.length()-1; i>=0; i--) {
			char c = str.charAt(i);
			b.append(c);
		}
		
		System.out.println(b.toString()); //non Synchronised But Fast
		
		StringBuilder b1 = new StringBuilder();
		for(int i= str.length()-1; i>=0; i--) {
			char c = str.charAt(i);
			b1.append(c);
		}
	}
}
