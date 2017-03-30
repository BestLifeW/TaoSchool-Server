package com.wtc433.service;

import java.util.List;

import com.wtc433.domain.Publish;


public interface PublishService {
	

	//增
	void insertShop(Publish shop);
	
	//删
	void deletePublishById(Integer id);
	
	
	//改
	void updatePublishById(Publish shop);
	
	//查询所有
	List<Publish> findAll();
	
	//查询ID查询
	Publish findPublishById(Integer id);
	
}
