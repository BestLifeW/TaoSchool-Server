package com.wtc433.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

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
import com.wtc433.domain.Shop;
import com.wtc433.service.OrderService;
import com.wtc433.service.ShopService;

@RequestMapping("/Order")
@Controller
public class OrderController {

	ObjectMapper objectMapper = new ObjectMapper();

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping("/addOrder.do")
	@ResponseBody
	public String addOrder(Orders orders) throws JsonGenerationException, JsonMappingException, IOException {
		HashMap<String, String> map = new HashMap<>();
		System.out.println("收到订单预定信息" + orders.toString());
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
	public String getOrderByShopid(@PathVariable("shopid") String shopid)
			throws JsonGenerationException, JsonMappingException, IOException {
		HashMap<String, String> map = new HashMap<>();

		System.out.println("收到商品id" + shopid);
		try {
			Orders findOrderByShopid = orderService.findOrderByShopid(shopid);
			System.out.println(findOrderByShopid);
			if (findOrderByShopid != null) {
				map.put("msg", "已经拍下");
			}
		} catch (Exception e) {
			map.put("msg", "没人预定");
		}
		return objectMapper.writeValueAsString(map);
	}


	@RequestMapping("/getOrdersByUsername/{username}") // 根据卖家获得
	@ResponseBody
	public String getOrderByUsername(@PathVariable("username") String username) throws Exception {
		List<OrdersExt> orderByUsername = orderService.findOrderByUsername(username);
		return objectMapper.writeValueAsString(orderByUsername);
	}

	@RequestMapping("/updateOrderById.do")
	@ResponseBody
	public String setOrderById(String id, String state)
			throws JsonGenerationException, JsonMappingException, IOException {
		int orderid = Integer.parseInt(id);
		System.out.println("========================>>"+state);	
		HashMap<String, String> msg = new HashMap<>();
		try {
			if (state.equals("交易完成")) { // 如果交易成功，那么修改 商品 状态为1 表示卖掉了
				Orders orders = orderService.findOrderById(orderid); //根据id获取到商品数据
				String shopid = orders.getShopid(); //然后获取商品id
				Shop shop =  new Shop();
				shop.setId(Integer.parseInt(shopid));
				shop.setState(1);
				shopService.updateShopById(shop);
			}
			orderService.updateOrderById(orderid, state);
			msg.put("msg", "修改成功");
		} catch (Exception e) {
			// TODO: handle exception
			msg.put("msg", "修改失败");
		}

		return objectMapper.writeValueAsString(msg);
	}

	@RequestMapping("/getOrdersBybuyer/{username}") // 根据买家
	@ResponseBody
	public String getOrderBybuyer(@PathVariable("username") String username)
			throws JsonGenerationException, JsonMappingException, IOException {
		List<OrdersExt> buybuyer = orderService.findOrderBuybuyer(username);
		return objectMapper.writeValueAsString(buybuyer);
	}
	
	@RequestMapping("/getOrdersByShopid/{shopid}")
	@ResponseBody
	public String getOrdersInShopid(@PathVariable("shopid")  String shopid)
			throws JsonGenerationException, JsonMappingException, IOException {
		OrdersExt findOrderByShopid = orderService.findOrdersByshopid(shopid);
		return objectMapper.writeValueAsString(findOrderByShopid);
	}
		
	
	@RequestMapping("/delOrderById/{orderid}")
	@ResponseBody
	public String delOrderById(@PathVariable("orderid") Integer orderid) throws Exception{
		System.out.println("要删除的id:"+orderid);
		HashMap<String, String> msg = new HashMap<>();
		try {
			orderService.findOrderById(orderid);
			msg.put("msg", "删除成功");
		} catch (Exception e) {
			msg.put("msg", "删除失败");
		}
		return objectMapper.writeValueAsString(msg);
	}
	
	
	@RequestMapping("/getOrdersByBuyerOrSaller/{username}/{type}")
	@ResponseBody
	public String getOrdersByBuyerOrSaller(@PathVariable("username") String username,@PathVariable("type") Integer type) throws Exception{
		List<OrdersExt> ordersExts;
		if (type==1) {
			ordersExts = orderService.findOrderByCompleteByBuyer(username);
		}else{
			ordersExts = orderService.findOrderByCompleteBySaller(username);
		}
		return objectMapper.writeValueAsString(ordersExts);
	}
	
}
