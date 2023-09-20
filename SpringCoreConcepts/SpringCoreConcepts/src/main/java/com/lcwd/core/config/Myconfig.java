package com.lcwd.core.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lcwd.core.DependencyInjection.Samosa;

@Configuration
public class Myconfig {
	
	@Bean(name="samosa1")
//	@Primary
	public Samosa getSamosa1()
	{
		return new Samosa("Tandori Samosa");
	}

	@Bean(name="samosa2")
//	@Primary
	public Samosa getSamosa2()
	{
		return new Samosa("Meetha Samosa");
	}


}
