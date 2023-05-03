package com.xworkz.autowired.classes;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
public class SensoredDoor {

	private Camera camera;
}
