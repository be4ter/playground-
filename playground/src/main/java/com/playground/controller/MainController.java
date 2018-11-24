package com.playground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {
	@GetMapping()
	public String main() {
		return "index";
	}

	@GetMapping("/signIn")
	public String signIn() {
		return "signIn";
	}

	@GetMapping("/search")
	public String search() {
		return "search";
	}

	@GetMapping("/signUp")
	public String signUp() {
		return "signUp";
	}

	@GetMapping("/list")
	public String list() {
		return "list";
	}

	@GetMapping("/form")
	public String form() {
		return "form";
	}
}
