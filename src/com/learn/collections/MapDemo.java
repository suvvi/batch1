package com.learn.collections;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		
		List<String> items = new ArrayList<String>();
		List<Integer> price = new ArrayList<Integer>();
		
		items.add("Onion");
		items.add("Potato");
		
		price.add(5);
		price.add(7);
		
		Map<String,Integer> item = new HashMap<String, Integer>();
		item.put("Onion", 5);
		System.out.println(item.get("Onion"));
		item.put("Potato", 7);
		item.put("Chilli", 5);
		item.put("Tomato", 17);
		item.put("Onion", 10);
		
		System.out.println(item.get("Onion"));
		
		Set<String> keys = item.keySet();
		for(String s : keys) {
			System.out.println("items is---"+s+ " Price is "+item.get(s));
		}
		
	}
}
