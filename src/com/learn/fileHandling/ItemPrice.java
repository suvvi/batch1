package com.learn.fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ItemPrice {
	//create 1 sheet with predefined rates
	public static void main(String[] args) {
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		try {
			fw = new FileWriter("C:\\Users\\19085\\Desktop\\Study\\Bill\\Rates.txt");
			System.out.println("how many istems are there in shop");
			int count = sc.nextInt();
			
			for(int i=0; i<count ; i++) {
				System.out.println("item name ????");
				fw.write(sc.next());
				fw.write(" ");
				System.out.println("item price ????");
				fw.write(sc.next());
				fw.write("\n");
				
			}
			System.out.println("I m done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
