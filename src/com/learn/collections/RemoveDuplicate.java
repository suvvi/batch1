package com.learn.collections;

import java.util.*;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str = "javaprogramming";
		
		Set<Character> s = new LinkedHashSet<Character>();
		
		for(int i=0; i<str.length(); i++) {
			s.add(str.charAt(i));
		}
		
		System.out.println(s);
	}
}
