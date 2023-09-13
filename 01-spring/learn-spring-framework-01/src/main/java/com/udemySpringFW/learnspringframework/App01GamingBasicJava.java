package com.udemySpringFW.learnspringframework;

import com.udemySpringFW.learnspringframework.game.GameRunner;
import com.udemySpringFW.learnspringframework.game.PacManGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();   // 1: Object Creation
		var gameRunner = new GameRunner(game); 
		// 2: Object Creation + Wiring of Dependencies
		// Game is a dependency of a GameRunner class
		gameRunner.run();
		

	}

}
