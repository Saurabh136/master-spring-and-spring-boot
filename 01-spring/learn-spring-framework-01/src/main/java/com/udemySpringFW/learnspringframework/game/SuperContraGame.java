package com.udemySpringFW.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
	
	public void up() {
		System.out.println("Up");
	}
	
	public void down() {
		System.out.println("Crouch");
	}
	
	public void left() {
		System.out.println("Move Back");
	}
	
	public void right() {
		System.out.println("Shoot a Bullet");
	}
	
}
