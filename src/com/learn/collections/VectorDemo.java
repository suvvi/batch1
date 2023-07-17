package com.learn.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		List<Integer> li= new Vector<Integer>();  //capacity -10
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println("size---"+li.size());
		li.get(2);
		
	}
}
