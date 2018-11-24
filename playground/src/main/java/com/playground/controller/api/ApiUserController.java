package com.playground.controller.api;

import com.playground.model.dto.User;
import com.playground.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sign")
public class ApiUserController {
	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public void test(User user) {
		userService.insert(user);
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUserList();
	}
}
