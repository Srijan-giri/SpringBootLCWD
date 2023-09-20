package com.lcwd.core.DependencyInjection;

/*
 * This class basically showed to create a bean in another way.
 */


public class Samosa {
	
	String name;

	public void eat()
	{
		
		System.out.println("Wow samosa is very spicy");
		System.out.println(name);
	}
	
	public Samosa(String name)
	{
		System.out.println("This is "+name);
		this.name=name;
	}
}
