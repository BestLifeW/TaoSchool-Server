package com.wtc433.service;

import java.util.List;

import com.wtc433.domain.Inquiry;
import com.wtc433.domain.InquiryExt;

public interface InquiryService {
	 List<Inquiry> findAll();
		
	 int insert(Inquiry record);
	 
	 int deleteByPrimaryKey(Integer id);
	 
	 Inquiry selectByPrimaryKey(Integer id);
	 
	 List<InquiryExt> findAllUserAndInquiry();
	 InquiryExt findAllUserAndInquiryByinquiryId(Integer inquiryid);

}
