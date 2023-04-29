package com.xworkz.assignment.part2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mirror {
	
	private int heightInFeets;
	private String shape;
	@Value("2.5")
	private float weight;
	
	public Mirror(@Value("3")int heightInFeets) {
		super();
		System.out.println("Running Mirror bean...");
		this.heightInFeets = heightInFeets;
	}
		
	@Value("Oval")
	public void setShape(String shape) {
		this.shape=shape;
	}

	@Override
	public String toString() {
		return "Mirror [heightInFeets=" + heightInFeets + ", shape=" + shape + ", weight=" + weight + "]";
	}
	
	
}
