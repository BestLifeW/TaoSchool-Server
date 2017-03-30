package com.wtc433.service;

import java.util.List;

import com.wtc433.domain.Shop;
import com.wtc433.domain.ShopExt;

public interface ShopService {

	//增
	void insertShop(Shop shop);
	
	//删
	void deleteShopById(Integer id);
	
	
	//改
	void updateShopById(Shop shop);
	
	//查询所有
	List<Shop> findAll();
	
	//查询ID查询
	List<Shop> findShopByUserName(String username);
	
	List<ShopExt> findShopAndUser();
	
	ShopExt findShopByShopId(Integer shopid);
	
}
