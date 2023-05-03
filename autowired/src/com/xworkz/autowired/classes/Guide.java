package com.xworkz.autowired.classes;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
public class Guide {

	private Security security;
	
	//2 ways to initializse the value using constructor
	//1. by parameterized constuctor
	//2. by @AllArgsConstructor
	/*below is implicitly autowired 
	 * public Guide(Security security) { System.out.println("Guide is running...");
	 * this.security=security; }
	 */
	
	
}
