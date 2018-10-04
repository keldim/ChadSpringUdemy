package com.chrisyoo.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("postconstruct");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("predestroy");
	}

	
	

}
