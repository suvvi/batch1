package com.learn.day5.oop;

public class EncapsulationDemo {
	public static void main(String[] args) {
		
		Animal cat = new Animal();
		cat.setAge(3);
		cat.setName("myCat");
		
		System.out.println("Age of my cat is ---"+cat.getAge());
		System.out.println("Name of my cat is ---"+cat.getName());
		
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Jack");
		emp1.setDepartment("IT");
		emp1.setAddrres("NJ");
		
		System.out.println(emp1.getAddrres() + " name-- "+emp1.getName());
		System.out.println(emp1); //com.learn.day5.oop.Employee@1c4af82c
		//Employee [id=1, name=Jack, department=IT, addrres=NJ]
		
		
		Employee emp2 = new Employee();
		emp2.setAddrres("Texas");
		emp2.setName("Jill");
		System.out.println(emp2);//com.learn.day5.oop.Employee@379619aa
		//Employee [id=0, name=null, department=null, addrres=null]
		
	}
}
