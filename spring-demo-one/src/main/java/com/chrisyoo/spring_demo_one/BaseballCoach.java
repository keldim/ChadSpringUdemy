package com.chrisyoo.spring_demo_one;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}



	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hello";
	}



	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}



	
}
