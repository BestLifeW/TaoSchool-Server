package com.wtc433.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtc433.dao.OrdersMapper;
import com.wtc433.domain.Orders;
import com.wtc433.service.OrderService;
/*
 * 订单界面的用户接口
 * */
@Service
public class OrderServiceImpl  implements OrderService{

	
	@Autowired
	private OrdersMapper ordermappers;
	
	@Override
	public void insertOrder(Orders order) {
		System.out.println(order.toString());
		try {
			ordermappers.insert(order);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		if (id!=null) {
			ordermappers.deleteByPrimaryKey(id);
		}
	}

	@Override
	public void updateOrderById(Orders orders) {
		// TODO Auto-generated method stub
		if (orders!=null) {
			ordermappers.updateByPrimaryKey(orders);
		}
	}

	@Override
	public List<Orders> findAll() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public Orders findOrderById(Integer id) {
		// TODO Auto-generated method stub
		ordermappers.selectByPrimaryKey(id);
		
		return 	ordermappers.selectByPrimaryKey(id);
	}

	@Override
	public Orders findOrderByShopid(String shopid) {
		try {
			Orders order = ordermappers.selectByShopid(shopid);
			return order;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Orders> findOrderinShopid(List<Integer> shopids) {
		List<Orders> orderlist = ordermappers.findOrderByshopid(shopids);
		return orderlist;
	}


}
