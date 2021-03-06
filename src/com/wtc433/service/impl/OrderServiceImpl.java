package com.wtc433.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtc433.dao.OrdersMapper;
import com.wtc433.domain.Orders;
import com.wtc433.domain.OrdersExt;
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
	public void updateOrderById(Integer id ,String state) {
		// TODO Auto-generated method stub
		if (id!=null) {
			ordermappers.updateByPrimaryKey(id,state);
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
	public List<OrdersExt> findOrderByUsername(String username) {
		List<OrdersExt> username2 = ordermappers.findOrderByUsername(username);
		
		return username2;
	}

	@Override
	public List<OrdersExt> findOrderBuybuyer(String username) {
		List<OrdersExt> buybuyer = ordermappers.findOrderBuybuyer(username);
		return buybuyer;
	}

	@Override
	public List<OrdersExt> findOrderByshopid(Integer shopid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrdersExt findOrdersByshopid(String shopid) {
		OrdersExt findOrdersByshopid = ordermappers.findOrdersByshopid(shopid);
		return findOrdersByshopid;
	}

	@Override
	public long countSalleByUsername(String username) {
		return ordermappers.countSallerByUsername(username);
	}

	@Override
	public List<OrdersExt> findCompleteOrderByUsername(String username) {
		
		return ordermappers.findCompleteOrderByUsername(username);
	}

	
	
	@Override
	public List<OrdersExt> findOrderByCompleteBySaller(String username) {
		return ordermappers.findOrderByCompleteBySaller(username);
	}

	@Override
	public List<OrdersExt> findOrderByCompleteByBuyer(String username) {
		return ordermappers.findOrderByCompleteByBuyer(username);
	}

}
