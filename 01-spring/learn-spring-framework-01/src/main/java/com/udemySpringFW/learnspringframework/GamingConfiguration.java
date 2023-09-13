package com.udemySpringFW.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.udemySpringFW.learnspringframework.game.GameRunner;
import com.udemySpringFW.learnspringframework.game.GamingConsole;
import com.udemySpringFW.learnspringframework.game.PacManGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
}
