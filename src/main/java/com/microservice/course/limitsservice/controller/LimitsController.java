package com.microservice.course.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.course.limitsservice.config.LimitsConfig;

@RestController
public class LimitsController {
	@Autowired
	private LimitsConfig config;
	
	@GetMapping
	public void printLimits() {
		System.out.println(config.getMinimum() + ", " + config.getMaximum());
	}
}
