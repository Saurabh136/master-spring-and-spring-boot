package com.udemySpringFW.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemySpringFW.learnspringframework.game.GameRunner;
import com.udemySpringFW.learnspringframework.game.GamingConsole;
import com.udemySpringFW.learnspringframework.game.PacManGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
		
		context.getBean(GamingConsole.class).up();
		
		
		context.getBean(GameRunner.class).run();
		
		}
	}
}
