package com.playground.contorller;

import com.playground.model.dto.Test;
import com.playground.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class ApiTestController {
	@Autowired
	private TestService testService;

	@PostMapping("")
	public Test test() {
		return testService.getTest();
	}
}
