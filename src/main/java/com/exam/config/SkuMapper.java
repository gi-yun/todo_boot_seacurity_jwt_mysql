package com.exam.config;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.exam.dto.Sku;
import com.exam.dto.Todo;

@Mapper
public interface SkuMapper {

	public List<Sku> findAll();
	
	
}
