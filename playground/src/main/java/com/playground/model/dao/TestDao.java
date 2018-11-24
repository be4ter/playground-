package com.playground.model.dao;

import com.playground.model.dto.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TestDao {
	List<Test> getTest();

	void setTest(String contents);
}
