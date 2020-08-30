package org.devsetgo.bpm.camunda.learning;

//import org.springframework.context.annotation.Profile;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.camunda.bpm.engine.RuntimeService;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@EnableProcessApplication  // ("myProcessApplicationName")
public class LearningApplication {

	public static void main(String... args) {

		SpringApplication.run(LearningApplication.class, args);
	}

}
