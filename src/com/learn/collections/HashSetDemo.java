package com.learn.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>(); //capacity -16
		
		System.out.println("added----"+s.add(10));
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(20);
		s.add(30);
		System.out.println("size---"+s.size());
		
		for (Integer integer : s) {
			System.out.println(integer);
		}
		s.remove(10);
		
		
	}
}
