package com.sudhakar.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class JenkinsController {

	
	@GetMapping
	public String welcome()
	{
		return "Welcome to Jenkins Demo";
	}
}
