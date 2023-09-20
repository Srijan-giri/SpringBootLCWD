package com.tut.withoutBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tut.withoutBoot.beans.CartService;

@Configuration
@ComponentScan(basePackages = {"com.tut.withoutBoot","another.world"})
public class AppConfig {
	
	// bean for cartservice
	
	@Bean("cartService1")
	public CartService cartService()
	{
		return new CartService();
	}
	
	
//	
//	@Bean
//	public ViewResolver viewResolver() 
//	{
//		ViewResolver v = new ViewResolver();
//		
//		return v;
//	}
}
