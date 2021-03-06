package com.wtc433.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.message.StringFormattedMessage;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wtc433.domain.Inquiry;
import com.wtc433.domain.InquiryExt;
import com.wtc433.service.InquiryService;

@Controller
@RequestMapping("/Inquiry")
public class InquiryController {
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	@Autowired
	private InquiryService inquiryService;
	
	@RequestMapping("/addInquiry.do")
	@ResponseBody
	public String addInquiry(Inquiry inquiry) throws Exception{
		
		HashMap<String, String> msg = new HashMap<>();
		if (inquiry.getIshopname()!=null) {
			try {
				inquiryService.insert(inquiry);
				msg.put("msg", "插入成功");
			} catch (Exception e) {
				msg.put("msg", "插入失败");
			}
		}else{
			msg.put("msg", "插入失败");
		}
		return objectMapper.writeValueAsString(msg);
	}
	
	@RequestMapping("/getInquiryById/{inquiryid}")
	@ResponseBody
	public String addInquiry(@PathVariable("inquiryid") Integer id) throws Exception{
		HashMap<String, String> msg = new HashMap<>();
		Inquiry selectByPrimaryKey = inquiryService.selectByPrimaryKey(id);
		return objectMapper.writeValueAsString(selectByPrimaryKey);
	}
	
	
	@RequestMapping("/getAllInquiry.do")
	@ResponseBody
	public String addInquiry() throws Exception{
		
		List<Inquiry> all = inquiryService.findAll();
		return objectMapper.writeValueAsString(all);
	}
	
	
	@RequestMapping("/getInquiryAndUserByInquiryId/{inquiryid}")
	@ResponseBody
	public String getInquiryAndUser (@PathVariable("inquiryid") Integer inquiryid) throws Exception{
		
		InquiryExt findAllUserAndInquiryByinquiryId = inquiryService.findAllUserAndInquiryByinquiryId(inquiryid);
		return objectMapper.writeValueAsString(findAllUserAndInquiryByinquiryId);
		
	}
	
	
	
	@RequestMapping("/getInquiryAndUser.do")
	@ResponseBody
	public String getInquiryAndUser () throws Exception{
		
		List<InquiryExt> xxx = inquiryService.findAllUserAndInquiry();
		return objectMapper.writeValueAsString(xxx);
		
	}
	
}
