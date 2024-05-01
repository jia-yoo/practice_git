package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SController {

	@RequestMapping("/hi")
	public @ResponseBody String text(){
		return "Hi";
	}
	
}
