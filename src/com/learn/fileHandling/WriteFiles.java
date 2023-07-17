package com.learn.fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFiles {
	public static void main(String[] args) {
		FileWriter fw = null;
		Scanner sc = null;
		try {
			fw = new FileWriter("C:\\Users\\19085\\Desktop\\Study\\tuppl.txt");
			sc = new Scanner(System.in);
			System.out.println("give me student count----");
			int count = sc.nextInt();
			for(int i=0; i<count; i++) {
				System.out.println("tell me student name---");
				fw.write(sc.next());
				
				System.out.println("tell me student rollNumber---");
				fw.write(" ");
				fw.write(sc.next());
				fw.write("\n");
			}
			System.out.println("I m done");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
