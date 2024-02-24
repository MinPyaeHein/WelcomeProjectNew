package com.welcome.api.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {
@GetMapping("/welcome")
public String welcome() {
	return "!!!!Welcome To Heroku Application!!!!";
	
}
}
