package com.xworkz.springprgm.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springprgm.springconfiguration.SpringConfiguration;

public class SpringRunner {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
	}
}


/*Spring is a framework
 * Spring is used to manage the object
 * manage - CID
 * CID - Create, Initialize, Destroy
 * framework - ready_made solution for common problems which is provided by 3rd party
 * API - ready_made solution for common problems which is provided by java
 * Spring wl create an obj for us
 */


//@Configuration - this is used provide meta-info to the spring
//@ComponectScan("package name") - used to scan the component present in this perticular package
//@Component - mention above the class name(dto), for which we need an object to create by spring