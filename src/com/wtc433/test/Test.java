package com.wtc433.test;

import com.wtc433.domain.Comment;
import com.wtc433.service.CommentService;
import com.wtc433.service.ShopService;
import com.wtc433.service.UserService;
import com.wtc433.service.impl.CommentServiceImpl;
import com.wtc433.service.impl.ShopServiceImpl;
import com.wtc433.service.impl.UserServiceImpl;

public class Test {
	
	
	
	@org.junit.Test
	public void getDemo(){
		
		CommentService  service = new CommentServiceImpl();
		Comment comment = new Comment();
		comment.setContent("啊啊啊啊啊啊啊");
		comment.setShopid(2);
		comment.setUsername("lovec");
		service.addComment(comment);
		
	}

}
