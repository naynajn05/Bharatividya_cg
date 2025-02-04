package com.tnsif.day1.encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
		Student student1=new Student();
		Student student2=new Student();
		
		student1.setAge(12);
		student1.setName("Ritika");
		student1.setPer(88.67f);


		System.out.println(student1);
		

	}

}
