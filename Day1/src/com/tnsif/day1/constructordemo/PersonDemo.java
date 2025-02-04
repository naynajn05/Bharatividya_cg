package com.tnsif.day1.constructordemo;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1=new Person(); //object created
		System.out.println(p1);
		
		p1.display();
		
		Person p2=new Person("Gauri",20,"Mumbai");
		System.out.println(p2);
		
	
		
	}

}
