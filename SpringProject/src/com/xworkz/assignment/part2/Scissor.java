package com.xworkz.assignment.part2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("scr")
public class Scissor {

	private String type;
	private float weightInGrams;
	@Value("gray")
	private String color;
	
	//preference: first constructor value, value assigned on variables & then setters values 

	public Scissor(@Value("Embroidery Scissors") String type, @Value("150") float weight, @Value("red")String color) {  
		super();
		System.out.println("Scissor is running...");
		this.type = type;
		this.weightInGrams = weight;
		this.color= color;

	}

	@Value("142")
	public void setType(float weight) {
		weightInGrams = weight;
	}


	@Override
	public String toString() {
		return "Scissor [type=" + type + ", weightInGrams=" + weightInGrams + ", color=" + color + "]";
	}

}
