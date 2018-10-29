package com.playground.model.dao;

import com.playground.model.dto.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
	Test getTest();
}
