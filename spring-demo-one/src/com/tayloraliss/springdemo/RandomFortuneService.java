package com.tayloraliss.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortuneList = {"Good luck today!", "Today will be so-so.", "Danger is near!"};
	
	@Override
	public String getFortune() {
		Random rand = new Random();
		int n = rand.nextInt(fortuneList.length);
		return fortuneList[n];
	}

}
