package com.udemySpringFW.learnspringframework.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1: Launch a Spring Context(application)
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
		
		
	    
		//2: Configure the things we want Spring Framework to manage 
		//Created a HelloWorldConfiguration class and gave annotation as - @Configuration
		//Inside the class we created a name method with annotation - @Bean
		
		//3: Retrieving Beans manage by Spring
		System.out.println(context.getBean("name"));  //Ask Spring to give name object
		//Anything that is manage by Spring is called Bean
		System.out.println(context.getBean("age")); 
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("person4Qualifier"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class)); // alternate method (by calling class direct)
		
		//System.out.println
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		}
		
	}

}
