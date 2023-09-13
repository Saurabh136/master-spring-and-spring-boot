package com.udemySpringFW.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy    //Intiazation logic will not be performed or executed when we use @Lazy
class ClassB {
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do something");
	}
	
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	
	
        public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
			
			System.out.println("Initialization of context completed");
			
			context.getBean(ClassB.class).doSomething();
			
			
		
		
		}
	}
}