package com.wtc433.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtc433.dao.InquirycommentMapper;
import com.wtc433.domain.Inquirycomment;
import com.wtc433.service.InquiryCommentService;

@Service
public class InquiryCommentServiceImpl implements InquiryCommentService {

	@Autowired
	private InquirycommentMapper InquirycommentMapper;

	/**
	 * 商品评论接口
	 */
	@Override
	public List<Inquirycomment> getCommentByInquiryid(Integer shopid) {
		if (shopid != null) {
			List<Inquirycomment> commentByShopid = InquirycommentMapper.getCommentByInquiryid(shopid);
			return commentByShopid;
		}
		return null;
	}

	@Override
	public int addComment(Inquirycomment comment) {
		
		return InquirycommentMapper.insert(comment);
	}

}
