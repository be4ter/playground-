package com.playground.service;

import com.playground.model.dto.User;

import java.util.List;

public interface UserService {
	void insert(User user);

	List<User> getUserList();
}
