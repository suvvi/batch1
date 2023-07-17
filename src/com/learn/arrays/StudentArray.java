package com.learn.arrays;

public class StudentArray {
	public static void main(String[] args) {
		
		Student[] arr = new Student[9];
		
		arr[0] = new Student(1,"jack","Texas",20);
		arr[1] = new Student(2,"jikk","Nepal",22);
		arr[2] = new Student(3,"Mack","Texas",10);
		arr[3] = new Student(4,"pack","edison",29);
		arr[4] = new Student(5,"rack","Texas",23);
		arr[5] = new Student(6,"tack","NYC",25);
		arr[6] = new Student(7,"back","Texas",26);
		arr[7] = new Student(8,"lack","LA",28);
		arr[8] = new Student(9,"nack","Texas",20);
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getAge()>25) {
				System.out.println(arr[i].getName());
				System.out.println("address-----"+arr[i].getAddress());
			}
		}
		
	}
}
