package com.xworkz.assignment.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("com.xworkz.assignment")
@ComponentScans({@ComponentScan("com.xworkz.assignment.part2"), @ComponentScan("com.xworkz.assignment.programs")}) // - we can keep multiple packages
public class AssignmentConfiguration {

	@Component("chair")			//bean of this class is printing in fully qua class name, if we give custom name then it is creating bean as chair?
	public class Chair{
		
		@Value("Red")
		private String color;
		@Value("Wing Chair")
		private String shape;
		//@Value("Deck")
		private String type;
		
		public Chair() {
			System.out.println("Chair is running...");
		}
		
		@Override
		public String toString() {
			return "Chair [color=" + color + ", shape=" + shape + ", type=" + type + "]";
		}		
	}
	
	@Component("hd")
	public class HairDryer{
		
		@Value("PHILIPS")
		private String brand;
		private String type;
		@Value("Purple")
		private String color;
		private float weightInWatts;
		private int rpm;
		
		
		public HairDryer(@Value("ceramic")String type, @Value("1500")float weightInWatts) {
			super();
			System.out.println("HairDryer is running...");
			this.type = type;
			this.weightInWatts = weightInWatts;
		}

		@Value("1000")
		public void setRpm(int rpm) {
			this.rpm = rpm;
		}

		@Override
		public String toString() {
			return "HairDryer [brand=" + brand + ", type=" + type + ", color=" + color + ", weightInWatts="
					+ weightInWatts + ", rpm=" + rpm + "]";
		}
	}
}
