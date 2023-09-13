package com.udemySpringFW.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
	
	public void up() {
		System.out.println("Go up");
	}
	
	public void down() {
		System.out.println("Go down");
	}
	
	public void left() {
		System.out.println("Go Left");
	}
	
	public void right() {
		System.out.println("Go Right");
	}

}
