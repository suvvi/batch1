package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		//List l = new ArrayList();
		List<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(22);
		li.add(12);
		li.add(20);
		li.add(29);
		li.remove(4);
		li.add(39);
		li.add(49);
		li.add(3, 34);
		li.remove(4);
		
		for (Integer integer : li) {
			
		}
		
		System.out.println("size----"+li.size());
		
		int i=0;
		while(i<li.size()) {
			System.out.println(li.get(i));
			i++;
		}
		li.clear();
		System.out.println("size----"+li.size());
		
		
	}
}
