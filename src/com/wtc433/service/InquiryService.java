package com.wtc433.service;

import java.util.List;

import com.wtc433.domain.Inquiry;

public interface InquiryService {
	 List<Inquiry> findAll();
		
	 int insert(Inquiry record);
	 
	 int deleteByPrimaryKey(Integer id);
	 
	 Inquiry selectByPrimaryKey(Integer id);

}
