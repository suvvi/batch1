package com.learn.day5.oop;

public class Cat extends Animal{ //Cat(child) IS-A Animal(Parent)

	private String owner;
	private String color;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Cat [owner=" + owner + ", color=" + color + "]";
	}
	
	
}
