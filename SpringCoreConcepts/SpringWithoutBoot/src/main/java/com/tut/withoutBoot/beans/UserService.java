package com.tut.withoutBoot.beans;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	public void saveUser()
	{
		System.out.println("User is saved successfully");
	}
}
