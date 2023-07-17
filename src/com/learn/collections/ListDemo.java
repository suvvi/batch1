package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

import com.learn.arrays.Student;

public class ListDemo {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(1);
		l.add("jack");
		l.add(3);
		l.add(new Student(1, "test", "India",20));
		l.add(3.0);
		l.add(45687654);
		l.add(1);
		l.add("jack");
		l.add(3);
		l.add(new Student(1, "test", "India",20));
		l.add(3.0);
		l.add(45687654);
		
		System.out.println("no of elements----"+l.size());

		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}

	}
}
