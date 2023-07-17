package com.learn.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("MyFile.txt");
			writer.write("This is my 1st file");
			writer.write("\n");
			writer.write("I m excited in learning file");
			writer.write("\n it's fun writing in file");
			System.out.println(" i m done");
			
		} catch (IOException e) {
			System.out.println("issue in file writing");
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}	
