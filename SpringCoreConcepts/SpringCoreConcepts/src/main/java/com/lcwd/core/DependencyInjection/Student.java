package com.lcwd.core.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public Student()
	{
		System.out.println("Creating student");
	}
	
	
	public void detail()
	{
		System.out.println("I am student detail");
	}

}
