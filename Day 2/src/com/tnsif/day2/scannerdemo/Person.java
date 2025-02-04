//Entity class
package com.tnsif.day2.scannerdemo;

public class Person {

	//data members
	private String name;
	private	int age;
	private String gender;
	private float income;
	private float tax;
	
	
	
	//parame. cons.
	public Person(String name, int age, String gender, float income) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.income = income;
	}
	//getter & setter
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getIncome() {
		return income;
	}
	public void setIncome(float income) {
		this.income = income;
	}
	
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	//object 
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" 
	+ gender + ", income=" + income + ", tax=" + tax
				+ "]";
		
		
	}
	
	
	
	
	
}
