package com.work.spring.springframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
 //private MarioGame game;
	@Autowired
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
