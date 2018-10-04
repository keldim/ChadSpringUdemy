package com.chrisyoo.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Random Service";
	}

}
