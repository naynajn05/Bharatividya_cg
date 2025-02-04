package com.tnsif.day2.scannerdemo;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name:");
		String name=sc.next();
		
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		System.out.println("Enter the gender:");
		String gender=sc.next();
		
		System.out.println("Enter the income:");
		float income=sc.nextFloat();
		
		Person p1=new Person(name,age,gender,income);
		
		CalculateTax tax=new CalculateTax();
		tax.calTax(p1);
		
		System.out.println(p1);
		
		
	}

}
