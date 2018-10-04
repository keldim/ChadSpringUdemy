package com.chrisyoo.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("file:/Users/ChrisYoo/Desktop/REFERENCE/SoftwareProjects/Spring/ChadSpring/spring-demo-annotations/sport.properties")
public class SportConfig {

	
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	
	@Bean
	public Coach swimCoach(FortuneService fortuneService) {
		SwimCoach mySwimCoach = new SwimCoach(happyFortuneService());
		return mySwimCoach;
	}
	
}
