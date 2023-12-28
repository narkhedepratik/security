package com.cjc.main.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

@RestController
public class HomeController {
	
	

	@GetMapping("/hello")
	public String hello(Authentication
			auth)
	{
		return "Hello "+auth.getName();
	}
	
	@GetMapping("/notification")
	public String getNotification()
	{
		return "Hello notification";
	}
}
