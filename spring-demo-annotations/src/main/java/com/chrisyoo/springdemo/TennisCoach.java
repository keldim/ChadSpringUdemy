package com.chrisyoo.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

//	@Value("${foo.email}")
	private String email;
//	@Value("${foo.team}")
	private String team;
	
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("startup stuff");
	}

	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("cleanup stuff");
	}
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	
	
}
