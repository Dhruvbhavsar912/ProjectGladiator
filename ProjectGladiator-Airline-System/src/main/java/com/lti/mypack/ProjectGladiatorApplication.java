package com.lti.mypack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.lti.mypack")
public class ProjectGladiatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectGladiatorApplication.class, args);
	}

}
