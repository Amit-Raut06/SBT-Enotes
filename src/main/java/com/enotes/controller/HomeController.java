package com.enotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";		
	}
	
	//to yahape jo bhi url mapping karne wala hu, uss 
	//particular url pe url page kholenge.
	@GetMapping("/signup")
	public String signup() {
		return "signup";		
	}
	
}
