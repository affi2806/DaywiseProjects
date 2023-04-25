package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnapDemo {
	
	@GetMapping("/str")
	public String getStreak(@RequestParam String user)
	{
		return "This is the Streak of "+user;
	}

}
