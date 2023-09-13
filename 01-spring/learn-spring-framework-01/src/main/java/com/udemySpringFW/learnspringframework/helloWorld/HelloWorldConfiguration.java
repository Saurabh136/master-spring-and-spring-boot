package com.udemySpringFW.learnspringframework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//record : 1: Released in JDk 16
// 2: equals, HashCode, and toString are automatically created.
// 3: Public accessor methods, constructor are also auto created
// 4: Eliminate verbosity in creating java beans
record Person (String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Saurabh";
	}
	
	@Bean
	public int age() {
		return 99;
	}
	
	@Bean
	public Person person() {
		return new Person("Suresh", 100, new Address("Beverly Hill", "USA"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(), address()); // existing name and age
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {  // Parameters are -- name, age, address2
		return new Person(name, age, address3); // existing name and age, address3
	}
	
	@Bean
	public Person person4Qualifier(String name, int age, @Qualifier("address3qualifier") Address address3) {  // Parameters are -- name, age, address2
		return new Person(name, age, address3); // existing name and age, address3
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Red Hill", "Jamaica");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Raj Path", "Delhi");
	}
	
	

}
