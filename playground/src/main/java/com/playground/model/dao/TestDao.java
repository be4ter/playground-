package com.playground.model.dao;

import com.playground.model.dto.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {
	List<Test> getTest();

	void setTest(String contents);
}
