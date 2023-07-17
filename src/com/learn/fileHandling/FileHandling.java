package com.learn.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String[] args) throws IOException {
		File file = new File("tupplLearning.txt");
		if(file.createNewFile()) {
			System.out.println("My file has been created----"+file.getAbsolutePath());
			System.out.println("name of my file----"+file.getName());
			System.out.println("name of my file Path----"+file.getPath());
		}else {
			System.out.println("My file already available----"+file.getName());
		}
	}
}
