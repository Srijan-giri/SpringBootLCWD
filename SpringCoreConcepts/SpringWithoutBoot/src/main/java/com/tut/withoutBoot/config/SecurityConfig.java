package com.tut.withoutBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tut.withoutBoot.web.AuthController;

@Configuration
public class SecurityConfig {
	
	@Bean
	public AuthController authController()
	{
		return new AuthController();
	}

}
