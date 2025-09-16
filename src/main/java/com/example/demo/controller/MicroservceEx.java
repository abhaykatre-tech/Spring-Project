package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroservceEx {

	@GetMapping("/hello/abhay")
	public String Hello() {
		return "hello from 8001 yeh hai micro service ka jadu i am github done spring2";
	}
}
