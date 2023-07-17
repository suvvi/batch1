package com.learn.collections;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
	public static void main(String[] args) {
		
		String str = "dfdghjklkjhgfdfghjklkjhgfdfghjklkjhgfa"; //d=4 g=6
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		
		int j=0;
		while(j<str.length()) {
			System.out.println(str.charAt(j));
			j++;
		}
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(m.containsKey(c)) { //d
				int count = m.get(c);
				m.put(c, count+1);
			}else {
				m.put(c, 1);
			}
		}
		System.out.println(m); //{d=4, f=6, g=6, h=6, j=6, k=6, l=3, a=1}
		
		for(char c: m.keySet()) {
			if(m.get(c)==1) {
				System.out.println("duplicate---"+c);
			}
		}
		
		
	}
}
