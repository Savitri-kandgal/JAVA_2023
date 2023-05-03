package com.xworkz.autowired.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Thing {

	@Autowired
	@Qualifier("id2")
	private int thingId;
	
}
