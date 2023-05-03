package com.xworkz.autowired.classes;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Security {

	private Thing thing;
														//implicitly autowired
	public Security(Thing thing) {
	this.thing=thing;
	}
	
}
