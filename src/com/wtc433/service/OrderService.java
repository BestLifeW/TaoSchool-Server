package com.wtc433.service;

import java.util.List;

import com.wtc433.domain.Orders;
import com.wtc433.domain.OrdersExt;


public interface OrderService {
	
	//增
	void insertOrder(Orders order);
	
	//删
	void deleteUserById(Integer id);
	
	
	//改
	void updateOrderById(Integer id ,String state);
	
	
	//查询所有
	List<Orders> findAll();
	
	//查询ID查询
	Orders findOrderById(Integer id);
	
	
	//查询 数据 用 商品id
	Orders findOrderByShopid(String shopid);
	
	
	//查询 
	List<Orders> findOrderinShopid(List<Integer> shopids);
	
	List<OrdersExt> findOrderByUsername (String username);
	
	List<OrdersExt> findOrderBuybuyer (String username);
}
