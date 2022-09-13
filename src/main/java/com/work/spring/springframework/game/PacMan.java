package com.work.spring.springframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GamingConsole{
	
	public void up() {
		System.out.println("Pacman Jump");
	}
	public void down() {
		System.out.println("Pacman goes down into a hole");
	}
	public void left() {
		System.out.println("Pacman stop");
	}
	public void right() {
		System.out.println("Pacman accelerate");
	}
	
}
