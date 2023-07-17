package com.learn.oop.inheritance;

public class PolimorphismDemo {
	public static void main(String[] args) {
		
		WildAnimal wa  = new WildAnimal();
		//wa.walk();
		
		DomesticAnimal da = new DomesticAnimal();
		//da.walk();
		
		Animal a = new Animal();
		Animal wild = new WildAnimal(); //creating object of parent class using subclass
		Animal dom = new DomesticAnimal();
		//WildAnimal sss = new Animal();
		a.walk(); //animal
		wild.walk(); //WA
		dom.walk(); //DA
	}
	
}	
