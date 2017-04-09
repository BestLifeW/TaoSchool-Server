package com.wtc433.controller;

import java.io.IOException;
import java.util.HashMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wtc433.domain.Orders;
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
		
		try {
			orderService.insertOrder(orders);
			map.put("msg", "插入成功");
		} catch (Exception e) {
			// TODO: handle exception
			map.put("msg", "插入失败");
		}
		
		
		return objectMapper.writeValueAsString(map);
	}
}
