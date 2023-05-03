package com.xworkz.autowired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.autowired.classes.Thing;

@Configuration
@ComponentScan("com.xworkz.autowired")
public class AutowiredConfig {

	@Bean
	public int id1() {
		System.out.println("running from id1");
		return 101;
	}
	
	@Bean
	public int id2() {
		System.out.println("running from id2");
		return 102;
	}
	

	@Bean
	public Thing thing1() {
		return null;
	}
	
	
}
