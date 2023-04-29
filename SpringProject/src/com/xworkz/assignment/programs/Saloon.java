package com.xworkz.assignment.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// value assigned to variables by constructor

@Component("sln")
public class Saloon {

	private String name;
	private String ownerName;
	private String type;
	private String location;
	private int noOfBarbers;

	//@value is only for primitive and string type variables
	public Saloon(@Value("Appu")String name, @Value("Santhosh")String ownerName, @Value("Specialty Salon")String type, @Value("Bangalore")String location, @Value("5")int noOfBarbers) {
		super();
		System.out.println("Saloon is running...");
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.location = location;
		this.noOfBarbers = noOfBarbers;
	}

	@Override
	public String toString() {
		return "Saloon [name=" + name + ", ownerName=" + ownerName + ", type=" + type + ", location=" + location
				+ ", noOfBarbers=" + noOfBarbers + "]";
	}

}
