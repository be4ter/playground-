package com.playground.service;

import com.playground.model.dto.Test;

import java.util.List;

public interface TestService {
	List<Test> getTest();

	void insert(String contents);
}
