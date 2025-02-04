package com.tnsif.day1.encapsulation;

//Entity
public class Student {
	
	//data members
	private String name;
	private int age;
	private float per;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	//Object
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", per=" + per + "]";
	}
	
	


}
