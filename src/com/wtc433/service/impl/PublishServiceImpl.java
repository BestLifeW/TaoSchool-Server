package com.wtc433.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtc433.dao.PublishMapper;
import com.wtc433.domain.Publish;
import com.wtc433.service.PublishService;


@Service
public class PublishServiceImpl implements PublishService {
	
	@Autowired
	private PublishMapper publishMapper;

	@Override
	public void insertShop(Publish shop) {
		// TODO Auto-generated method stub
		publishMapper.insert(shop);
	}

	@Override
	public void deletePublishById(Integer id) {
		// TODO Auto-generated method stub
		publishMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void updatePublishById(Publish shop) {
		// TODO Auto-generated method stub
		
		publishMapper.updateByPrimaryKey(shop);
	}

	@Override
	public List<Publish> findAll() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Publish findPublishById(Integer id) {
		// TODO Auto-generated method stub
		
		return publishMapper.selectByPrimaryKey(id);
		
	}

}
