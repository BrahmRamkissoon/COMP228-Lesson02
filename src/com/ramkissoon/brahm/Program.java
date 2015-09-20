package com.ramkissoon.brahm;

public class Program {
	public static Person person;	//reference to the Person class	
	public static void main(String[] args) {
		System.out.println("Program started...");
		
		person = new Person(46);
		
		person.setName("Tom");
		person.setGender("Male");
		
		System.out.println(person.getName());
		
		person.runs();
		
		System.out.printf("%s is %d years old",person.getName(), person.getAge());
		
	}

}
