package com.springit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//for @Controller & @ResponseBody
@RestController
public class HomeController {

	@RequestMapping("/hello")
	public String hello() {
		return "What up there!";
	}
}
