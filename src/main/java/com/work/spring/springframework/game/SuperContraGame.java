package com.work.spring.springframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{
	
	public void up() {
		System.out.println("Contra Jump");
	}
	public void down() {
		System.out.println("Contra down into a hole");
	}
	public void left() {
		System.out.println("Contra stop");
	}
	public void right() {
		System.out.println("Contra accelerate");
	}
	
}
