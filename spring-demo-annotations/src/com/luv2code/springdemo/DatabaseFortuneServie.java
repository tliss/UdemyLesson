package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneServie implements FortuneService {

	@Override
	public String getFortune() {
		return "Here's database service";
	}

}
