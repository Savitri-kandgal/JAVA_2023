package com.xworkz.assignment.part2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Barber {

	private String name;
	private int experience;
	private int age;
	private int salary;
	private long contactNo;
	private char gender;
	
	public Barber(@Value("Santhosh")String name, @Value("5")int experience, @Value("25")int age, @Value("20000")int salary, @Value("9987654323")long contactNo, @Value("M")char gender) {
		super();
		System.out.println("running Barber bean...");
		this.name = name;
		this.experience = experience;
		this.age = age;
		this.salary = salary;
		this.contactNo = contactNo;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Barber [name=" + name + ", experience=" + experience + ", age=" + age + ", salary=" + salary
				+ ", contactNo=" + contactNo + ", gender=" + gender + "]";
	}
	
	
	
	
}
