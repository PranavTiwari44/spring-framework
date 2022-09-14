package com.work.spring.springframework;

import com.work.spring.springframework.enterprise.MyWebController;
import com.work.spring.springframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		GamingConsole game = new PacMan();
//		GameRunner runner = new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
