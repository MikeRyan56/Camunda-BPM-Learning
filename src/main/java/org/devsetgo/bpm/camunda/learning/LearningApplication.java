package org.devsetgo.bpm.camunda.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;


@EnableProcessApplication  // ("myProcessApplicationName")
@SpringBootApplication
public class LearningApplication {

    @Autowired
    private RuntimeService runtimeService;

	public static void main(String[] args) {
	    SpringApplication.run(LearningApplication.class, args);
	}


}
