package com.learn.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
	public static void main(String[] args)  {
		BufferedReader bf = null;
		try {
			FileReader read = new FileReader("C:\\Users\\19085\\Desktop\\Meeting.txt");
			bf = new BufferedReader(read);
			
			String line ;
			while((line = bf.readLine() )!= null) {
				if(line.contains("zoom"))
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException------");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOEXCEPTION");
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
