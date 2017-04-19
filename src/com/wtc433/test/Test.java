package com.wtc433.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.core.config.Order;

import com.wtc433.domain.Comment;
import com.wtc433.domain.Orders;
import com.wtc433.service.CommentService;
import com.wtc433.service.OrderService;
import com.wtc433.service.ShopService;
import com.wtc433.service.UserService;
import com.wtc433.service.impl.CommentServiceImpl;
import com.wtc433.service.impl.OrderServiceImpl;
import com.wtc433.service.impl.ShopServiceImpl;
import com.wtc433.service.impl.UserServiceImpl;

public class Test {
	
	
	
	@org.junit.Test
	public void getDemo(){
		
	/*		CommentService  service = new CommentServiceImpl();
			Comment comment = new Comment();
			comment.setContent("啊啊啊啊啊啊啊");
			comment.setShopid(2);
			comment.setUsername("lovec");
			service.addComment(comment);
			*/
		OrderService orderService = new OrderServiceImpl();
		List<Integer> shopids = new ArrayList<>();
		shopids.add(1);
		shopids.add(3);
		shopids.add(6);
		List<Orders> findOrderinShopid = orderService.findOrderinShopid(shopids);
		for (Orders orders : findOrderinShopid) {
			System.out.println(orders);
		}

	}

}
