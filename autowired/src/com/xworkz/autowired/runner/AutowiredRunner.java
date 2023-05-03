package com.xworkz.autowired.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.classes.Musuem;
import com.xworkz.autowired.config.AutowiredConfig;

public class AutowiredRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(AutowiredConfig.class);
		
		int count=spring.getBeanDefinitionCount();
		System.out.println("No of Beans: "+count);
		
		Musuem ms=spring.getBean(Musuem.class);
		System.out.println(ms);
	}
}
