package com.wtc433.controller;

import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wtc433.domain.Comment;
import com.wtc433.domain.Inquirycomment;
import com.wtc433.service.CommentService;
import com.wtc433.service.InquiryCommentService;

@Controller
@RequestMapping("/InquiryComment")
public class InquiryCommentController {
	ObjectMapper objectMapper = new ObjectMapper();
	
	@Autowired
	private InquiryCommentService commentService;
	
	@ResponseBody
	@RequestMapping(value="/getComment/{inquiryid}")
	public String getCommentByShopid(@PathVariable("inquiryid") Integer inquiryid) throws Exception{
		System.out.println("接受到获取评论请求，商品ID是"+inquiryid);
		List<Inquirycomment> commentByShopid = commentService.getCommentByInquiryid(inquiryid);
		System.out.println(objectMapper.writeValueAsString(commentByShopid));
		return objectMapper.writeValueAsString(commentByShopid);
	}
	
	
	@ResponseBody
	@RequestMapping("/addComment.do")
	public String addComment(Inquirycomment comment) throws Exception{
		System.out.println(comment.toString());
		HashMap<String, String> map  = new HashMap<>();
		int addComment = commentService.addComment(comment);
		if (addComment!=0) {
			System.out.println("评论成功");
			map.put("msg", "评论成功");
		}else{
			map.put("msg", "评论失败");
		}
		return objectMapper.writeValueAsString(map);
	}
}

