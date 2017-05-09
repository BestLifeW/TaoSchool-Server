package com.wtc433.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtc433.dao.InquiryMapper;
import com.wtc433.domain.Inquiry;
import com.wtc433.service.InquiryService;

@Service
public class InquiryServiceImpl implements InquiryService {

	@Autowired
	private InquiryMapper inquiryMapper;
	
		
	@Override
	public List<Inquiry> findAll() {
		
		return inquiryMapper.findAll();
	}

	@Override
	public int insert(Inquiry record) {
		
		int insert = inquiryMapper.insert(record);
		return insert;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		int primaryKey = inquiryMapper.deleteByPrimaryKey(id);
		return primaryKey;
	}

	@Override
	public Inquiry selectByPrimaryKey(Integer id) {
		Inquiry selectByPrimaryKey = inquiryMapper.selectByPrimaryKey(id);
		
		return selectByPrimaryKey;
	}

}
