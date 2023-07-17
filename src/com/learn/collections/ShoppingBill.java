package com.learn.collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingBill {
	
	
	public static void main(String[] args) throws IOException {
		Map<String,Integer> price = getPrice();
		Scanner sc = new Scanner(System.in);
		System.out.println("how many items----");
		int count = sc.nextInt();
		int total =0;
		for(int i=0; i<count ;i++) {
			System.out.println("give me Name of items from----"+price.keySet());
			String item = sc.next();
			if(!price.containsKey(item)) {
				System.out.println("wrong item added we r not selling  ---"+item);
				break;
			}else {
				System.out.println("quantity of items----");
				int quantity = sc.nextInt();
				total = total + price.get(item)*quantity;
			}
		}
		
		System.out.println(total);
	}
	
	public static Map<String,Integer> getPrice() throws IOException {
		Map<String,Integer> price = new HashMap<String,Integer>();
		FileReader read = new FileReader("C:\\Users\\19085\\Desktop\\Study\\Bill\\Rates.txt");
		BufferedReader bf = new BufferedReader(read);
		String line ;
		while((line = bf.readLine() )!= null) { //"Potato 2"
			String[] data = line.split(" ");
			price.put(data[0], Integer.parseInt(data[1]));
		}
		
		return price;
	}
}
