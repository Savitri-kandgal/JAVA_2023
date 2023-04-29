package com.xworkz.assignment.runner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.assignment.configuration.AssignmentConfiguration;
import com.xworkz.assignment.configuration.AssignmentConfiguration.Chair;
import com.xworkz.assignment.configuration.AssignmentConfiguration.HairDryer;
import com.xworkz.assignment.part2.Barber;
import com.xworkz.assignment.part2.Mirror;
import com.xworkz.assignment.part2.Scissor;
import com.xworkz.assignment.programs.Saloon;
import com.xworkz.assignment.programs.ShavingCream;
import com.xworkz.assignment.programs.Trimmer;

public class AssignmentRunner {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext springContainer = new AnnotationConfigApplicationContext(AssignmentConfiguration.class);
		int noOfBeans=springContainer.getBeanDefinitionCount();
		System.out.println();
		System.out.println("No. of Beans created by container: "+noOfBeans);
		System.out.println();
			String[] beanNames = springContainer.getBeanDefinitionNames();
			Stream.of(beanNames).forEach(System.out::println);
			
		//	Saloon bean=springContainer.getBean(Saloon.class);				
		//	Saloon bean2=(Saloon) springContainer.getBean("sln");			// we hv to cast it to respective type if we use custom name to get the bean
			Saloon bean3=springContainer.getBean("sln", Saloon.class);
			System.out.println(bean3);
		
		//	Scissor scr1=springContainer.getBean(Scissor.class);
		//	Scissor scr2=(Scissor) springContainer.getBean("scr");		
			Scissor scr3=springContainer.getBean("scr", Scissor.class);
			System.out.println(scr3);
			
		//	Chair chair1= springContainer.getBean(Chair.class);
		//	Chair chair2=(Chair) springContainer.getBean("chair");
			Chair chair3=springContainer.getBean("chair", Chair.class);
			System.out.println(chair3);
			
			ShavingCream sc=(ShavingCream) springContainer.getBean("sc");
			System.out.println(sc);
			
			//Mirror mirror=springContainer.getBean(Mirror.class);
			//System.out.println(mirror);
			Stream.of(springContainer.getBean(Mirror.class)).forEach(System.out::println);
			
			Stream.of(springContainer.getBean("hd", HairDryer.class)).forEach(System.out::println);
			
			Stream.of(springContainer.getBean(Trimmer.class)).forEach(System.out::println);
			
			Stream.of(springContainer.getBean(Barber.class)).forEach(System.out::println);;
			
	}
}
