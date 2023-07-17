package com.learn.day5.oop;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	private String addrres;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddrres() {
		return addrres;
	}
	public void setAddrres(String addrres) {
		this.addrres = addrres;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", addrres=" + addrres + "]";
	}
	
}
