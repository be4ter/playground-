package com.playground.service.implement;

import com.playground.model.dao.UserDao;
import com.playground.model.dto.User;
import com.playground.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}
}
