package com.lcwd.core.lifecycle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("student5")
public class Student {

	public Student()
	{
		System.out.println("Creating Student.........");
	}
	
	@PostConstruct
	public void postConstruct()
	{
		// some initialization
		System.out.println("## Student bean is created : created() ##");
	}
	
	
	@PreDestroy
	public void preDestroy()
	{
		System.out.println("# :bye bye student bean: destroy() #");
	}
	
	
	
}
