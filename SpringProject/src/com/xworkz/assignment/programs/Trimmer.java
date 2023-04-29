package com.xworkz.assignment.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trimmer {

	private String brand;
	@Value("black")
	private String color;
	private int price;
	private float heightInCm;
	
	
	public Trimmer(@Value("Menhood")String brand) {
		super();
		System.out.println("Running Trimmer bean...");
		this.brand = brand;
	}

	@Value("1500")
	public void setPrice(int price) {
		this.price = price;
	}

	@Value("85")
	public void setHeight(float height) {
		this.heightInCm = height;
	}

	@Override
	public String toString() {
		return "Trimmer [brand=" + brand + ", color=" + color + ", price=" + price + ", heightInCm=" + heightInCm + "]";
	}
	
	
	
}
