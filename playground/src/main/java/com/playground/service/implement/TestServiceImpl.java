package com.playground.service.implement;

import com.playground.model.dao.TestDao;
import com.playground.model.dto.Test;
import com.playground.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;

	@Override
	public List<Test> getTest() {
		return testDao.getTest();
	}

	@Override
	public void insert(String contents) {
		testDao.setTest(contents);

	}
}
