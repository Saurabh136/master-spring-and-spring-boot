package com.udemySpringFW.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	//private MarioGame game;
	private GamingConsole game;
	
	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {  // writing constructor
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game: "+ game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
