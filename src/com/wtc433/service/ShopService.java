package com.wtc433.service;

import java.util.List;

import com.wtc433.domain.Shop;
import com.wtc433.domain.ShopExt;
import com.wtc433.domain.SubmitDetail;

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
	List<ShopExt> findShopByUserName(String username);
	
	List<ShopExt> findShopAndUser();
	
	ShopExt findShopByShopId(Integer shopid);
	
	//根据用户ID和用户名显示要提交的消息
	SubmitDetail findSubmitDetailByShopIdAndUsername(Integer shopid,String username);

	List<ShopExt> findShopByCategory(String category);

	List<ShopExt> findShopBylikeUsername(String username);
	
}
