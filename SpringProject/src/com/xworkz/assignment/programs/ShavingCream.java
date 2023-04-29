package com.xworkz.assignment.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sc")
public class ShavingCream {

	@Value("Old Spice")
	private String brand;
	private int price;
	private int quantityInGrams;

	public ShavingCream(@Value("150")int price) {
		super();
		System.out.println("runnung shaving crean bean...");
		this.price = price;
	}

	@Value("200")
	public void setQuantityInGrams(int quantityInGrams) {
		this.quantityInGrams = quantityInGrams;
	}

	@Override
	public String toString() {
		return "ShavingCream [brand=" + brand + ", price=" + price + ", quantityInGrams=" + quantityInGrams + "]";
	}

}
