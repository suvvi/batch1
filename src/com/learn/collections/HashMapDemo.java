package com.learn.collections;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		
		Map<Integer,String> students = new Hashtable<Integer,String>();
		students.put(1, "Jack");
		students.put(10, "mack");
		students.put(11, "pack");
		students.put(12, "rack");
		students.put(13, "tack");
		students.put(14, "hack");
		students.put(1, "lack");
		//students.put(null, "lack");
		students.put(23, null);
		
		System.out.println(students.size());
		System.out.println(students.get(1));
		
		for(Integer k : students.keySet()) {
			System.out.println("rollnumber is ---"+k + " name is ---"+students.get(k));
		}
	}
}
