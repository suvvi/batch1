package com.learn.collections;

import java.util.*;
import java.util.Set;

public class ShowDuplicate {
	public static void main(String[] args) {
		String str = "javaprogramminggm";
		
		Set<Character> s = new HashSet<Character>();
		
		Set<Character> duplicates = new HashSet<Character>();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(!s.add(c)) {
				duplicates.add(c);
			}
		}
		
		System.out.println(s);
		System.out.println(duplicates);
	}
}
