package com.playground.model.dao;

import com.playground.model.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDao {
	void insert(User user);

	List<User> getUserList();
}
