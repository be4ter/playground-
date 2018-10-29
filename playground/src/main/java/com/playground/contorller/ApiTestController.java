package com.playground.contorller;

import com.playground.model.dto.Test;
import com.playground.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
public class ApiTestController {
	@Autowired
	private TestService testService;

	@PostMapping("")
	public List<Test> test() {
		return testService.getTest();
	}

	@GetMapping("/{contents}")
	public void test(@PathVariable String contents) {
		testService.insert(contents);
	}
}
