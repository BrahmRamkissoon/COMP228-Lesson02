package com.ramkissoon.brahm;

import java.util.Scanner;

public class Lesson02Test {
	public static Person person;	//reference to the Person class	
	public static void main(String[] args) {
		System.out.println("Program started...");
		Scanner input = new Scanner(System.in);
			
		// Prompt user for Name
		System.out.print("Enter your name: ");
		String myName = input.nextLine();
		
		// Prompt user for Gender
		System.out.print("Enter your gender: ");
		String myGender = input.nextLine();
		
		// Prompt user for Age
		System.out.print("Enter your age: ");
		int myAge = input.nextInt();
				
		person = new Person(myAge);
		
		person.setName(myName);
		person.setGender(myGender);
		
		person.runs();
		
		System.out.printf("%s is %d years old and is %s",
				person.getName(), person.getAge(), person.getGender());
		
	}

}
