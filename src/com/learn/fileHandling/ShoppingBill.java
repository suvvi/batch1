package com.learn.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ShoppingBill {
	
	public static void main(String[] args) throws IOException {
		
		//name of person to purchase -> aparna
		//create my file with name C:\Users\19085\Desktop\Study\Bill\aparna.txt
		
		String str = "C:\\Users\\19085\\Desktop\\Study\\Bill\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("give me Name----");
		String name = sc.next();
		FileWriter fw = new FileWriter(str+name+".txt");
		BufferedReader bf = null;
		//how many items to purchase  4
		System.out.println("how many items----");
		int count = sc.nextInt();
		int totalPrice =0;
		for(int i=0; i<count; i++) {
			System.out.println("please select item ");
			String item = sc.next();
			System.out.println("please select quantity ");
			int quantity = sc.nextInt();
			//getting t he price
			FileReader read = new FileReader("C:\\Users\\19085\\Desktop\\Study\\Bill\\Rates.txt");
			bf = new BufferedReader(read);
			String line ;
			int unitPrice =0;
			while((line = bf.readLine() )!= null) {
				if(line.contains(item)) { //potato 2
					String[] data = line.split(" ");
					unitPrice = Integer.parseInt(data[1]);
					break;
				}
			}
			int price = unitPrice*quantity;
			totalPrice = totalPrice+price;
			fw.write("price for "+quantity + " "+item +"="+price);   //price for 2 potato = 20
			fw.write("\n");
			
		}
		fw.write("your total bill is---"+totalPrice);
		fw.close();
	}
}
