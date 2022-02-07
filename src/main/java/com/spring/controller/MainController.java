package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8082/Player
@Controller
@RequestMapping("/")
public class MainController {

	//http://localhost:8082/Player/
	@GetMapping("")
	public String mainApp() {
		return "home";
	}
}
