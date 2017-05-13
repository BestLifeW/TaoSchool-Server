package com.wtc433.service;

import java.util.List;

import com.wtc433.domain.Comment;
import com.wtc433.domain.Inquirycomment;

public interface InquiryCommentService {
	
	
	//根据商品id获取用户的所有评论
	List<Inquirycomment> getCommentByInquiryid(Integer shopid);
	
	//插入评论数据
	int addComment(Inquirycomment comment);
}
