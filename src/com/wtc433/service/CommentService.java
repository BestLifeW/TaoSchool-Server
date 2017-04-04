package com.wtc433.service;

import java.util.List;

import com.wtc433.domain.Comment;

public interface CommentService {
	
	
	//根据商品id获取用户的所有评论
	List<Comment> getCommentByShopid(Integer shopid);
	
	//插入评论数据
	int addComment(Comment comment);
}
