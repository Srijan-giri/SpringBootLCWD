package com.tut.withoutBoot.web;

import org.springframework.stereotype.Component;

@Component
public class HomeController {

	public void homePage()
	{
		System.out.println("home page is called");
	}
}
