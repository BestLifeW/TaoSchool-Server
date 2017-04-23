package com.wtc433.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.core.config.Order;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wtc433.domain.Orders;
import com.wtc433.domain.OrdersExt;
import com.wtc433.service.CommentService;
import com.wtc433.service.OrderService;

@RequestMapping("/Order")
@Controller
public class OrderController {
		
	ObjectMapper objectMapper = new ObjectMapper();
	
	@Autowired
	private OrderService orderService;
	
	
	@RequestMapping("/addOrder.do")
	@ResponseBody
	public String addOrder(Orders orders) throws JsonGenerationException, JsonMappingException, IOException{
		HashMap<String, String> map = new HashMap<>();
		System.out.println("收到订单预定信息"+orders.toString());
		try {
			orderService.insertOrder(orders);
			map.put("msg", "插入成功");
		} catch (Exception e) {
			
			map.put("msg", "插入失败");
		}
		
		return objectMapper.writeValueAsString(map);
	}
	
	@RequestMapping("/getOrderByShopid/{shopid}")
	@ResponseBody
	public String getOrderByShopid(@PathVariable("shopid") String shopid) throws JsonGenerationException, JsonMappingException, IOException{
		HashMap<String, String> map = new HashMap<>();
		
		System.out.println("收到商品id"+shopid);
		try {
			Orders findOrderByShopid = orderService.findOrderByShopid(shopid);
			System.out.println(findOrderByShopid);
			if (findOrderByShopid!=null) {
				map.put("msg", "已经拍下");
			}
		} catch (Exception e) {
			map.put("msg", "没人预定");
		}
		return objectMapper.writeValueAsString(map);
	}
	
	@RequestMapping("/getOrdersInShopid.do")
	@ResponseBody
	public String getOrdersInShopid(List<Integer> shopid) throws JsonGenerationException, JsonMappingException, IOException{
			List<Orders> findOrderByShopid = orderService.findOrderinShopid(shopid);
		return objectMapper.writeValueAsString(findOrderByShopid);
	}
	
	@RequestMapping("/getOrdersByUsername/{username}")
	@ResponseBody
	public String getOrderByUsername(@PathVariable("username") String username) throws Exception{
		List<OrdersExt> orderByUsername = orderService.findOrderByUsername(username);
		return objectMapper.writeValueAsString(orderByUsername);
	}
	
	@RequestMapping("/updateOrderById.do")
	@ResponseBody
	public String setOrderById(String id,String state) throws JsonGenerationException, JsonMappingException, IOException{
		int orderid = Integer.parseInt(id);
	
		HashMap<String, String> msg =new HashMap<>();
		try {
			orderService.updateOrderById(orderid,state);
			msg.put("msg", "修改成功");
		} catch (Exception e) {
			// TODO: handle exception
			msg.put("msg", "修改失败");
		}
		
		return objectMapper.writeValueAsString(msg);
		
		
	}
}
