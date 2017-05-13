package com.wtc433.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtc433.dao.ShopMapper;
import com.wtc433.dao.UserlikeMapper;
import com.wtc433.domain.Shop;
import com.wtc433.domain.ShopExt;
import com.wtc433.domain.SubmitDetail;
import com.wtc433.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopMapper shopmapper;
	
	@Autowired
	private UserlikeMapper userlikemapper;
	@Override
	public void insertShop(Shop shop) {
		// TODO Auto-generated method stub
		if (shop!=null) {
			shopmapper.insert(shop);
		}
		
	}

	@Override
	public void deleteShopById(Integer id) {
		// TODO Auto-generated method stub
		if (id!=null) {
			shopmapper.deleteByPrimaryKey(id);
		}
	
	}

	@Override
	public void updateShopById(Shop shop) {
		// TODO Auto-generated method stub
		if (shop!=null) {
			shopmapper.updateByPrimaryKeySelective(shop);
		}
	}

	@Override
	public List<Shop> findAll() {
		// TODO Auto-generated method stub
		return shopmapper.findAll();
	}

	@Override
	public List<ShopExt> findShopByUserName(String username) {
		// TODO Auto-generated method stub
		return shopmapper.findShopAndUserByUsername(username);
	}

	@Override
	public List<ShopExt> findShopAndUser() {
		// TODO Auto-generated method stub
		return shopmapper.findShopAndUser();
	}

	@Override
	public ShopExt findShopByShopId(Integer shopid) {
		ShopExt shop = shopmapper.selectByPrimaryKey(shopid);
		return  shop;
	}

	@Override
	public SubmitDetail findSubmitDetailByShopIdAndUsername(Integer shopid, String username) {
		// TODO Auto-generated method stub
		SubmitDetail submitDetail = shopmapper.findSubmitDetailByShopId(shopid, username);
		return submitDetail;
	}

	@Override
	public List<ShopExt> findShopByCategory(String category) {
		System.out.println(category);
		List<ShopExt> shops = shopmapper.findShopByCategory(category);
		return shops;
	}

	@Override
	public List<ShopExt> findShopBylikeUsername(String username) {
		
		return shopmapper.getShopByLikeUsername(username);
	}


}
