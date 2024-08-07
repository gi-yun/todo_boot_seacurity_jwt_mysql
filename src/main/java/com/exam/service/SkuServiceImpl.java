package com.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.config.SkuMapper;
import com.exam.dto.Sku;

@Service
public class SkuServiceImpl implements SkuService{

	SkuMapper skumapper ;
	
	public SkuServiceImpl(SkuMapper skumapper) {
		this.skumapper = skumapper;
	}

	@Override
	public List<Sku> findAll() {
		return skumapper.findAll();
	}


}
