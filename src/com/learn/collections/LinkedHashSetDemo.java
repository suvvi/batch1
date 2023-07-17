package com.learn.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		Set<String> s = new LinkedHashSet<String>();
		
		s.add("jack");
		s.add("mack");
		s.add("jack");
		s.add("jill");
		s.add("mack");
		s.add("pack");
		
		for(String str : s) {
		//	System.out.println(str);
		}
		
		Iterator<String> itr = s.iterator(); //hasNext - next
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
