package com.tut.withoutBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tut.withoutBoot.web.HomeController;

@Configuration
public class WebConfig {

	// declare the homecontroller bean
	
	@Bean
	public HomeController homeController()
	{
		return new HomeController();
	}
}
