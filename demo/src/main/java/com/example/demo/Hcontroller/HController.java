package com.example.demo.Hcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HController {
	@RequestMapping("/new")
	public String root() {
		return "NewFile";
	}
}
