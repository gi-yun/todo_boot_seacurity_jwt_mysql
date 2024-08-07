package com.exam.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dto.Sku;
import com.exam.service.SkuService;


@RestController
public class SkuController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	SkuService skuservice;
	
	@GetMapping("/product")
	public List<Sku> listSku(){
	List<Sku> list = skuservice.findAll();
	
		
	return list;
	}
	
}
