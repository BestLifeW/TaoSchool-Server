package com.wtc433.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtc433.dao.CommentMapper;
import com.wtc433.domain.Comment;
import com.wtc433.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentMapper commentMapper;

	/**
	 * 商品评论接口
	 */
	@Override
	public List<Comment> getCommentByShopid(Integer shopid) {
		if (shopid != null) {
			List<Comment> commentByShopid = commentMapper.getCommentByShopid(shopid);
			return commentByShopid;
		}
		return null;
	}

	@Override
	public int addComment(Comment comment) {
		
		return commentMapper.insert(comment);
	}

}
