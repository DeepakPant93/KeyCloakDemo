package com.keyclock.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/keycloak")
public class KeycloakController {

	@GetMapping("/test")
	public String test() {
		
		return "This is test";
	}
}
