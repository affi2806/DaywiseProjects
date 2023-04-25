package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstaDemo {
	
	@GetMapping("/signin")
	public String signinpage()
	{
		return "Sign in successful";
	}
	
	@GetMapping("/landing/{username}")
	public String landingpage(@PathVariable("username") String username)
	{
		return "The landing page of "+username;
	}

}
