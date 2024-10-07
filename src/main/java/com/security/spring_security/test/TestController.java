package com.security.spring_security.test;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/login")
	public Authentication loginTest(Authentication authentication) {
		
		return authentication;
	}
	
}
