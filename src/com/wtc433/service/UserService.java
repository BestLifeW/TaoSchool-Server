package com.wtc433.service;

import java.util.List;

import com.wtc433.domain.User;

public interface UserService {
	
	//增
	void insertUser(User user);
	
	//删
	void deleteUserById(Integer id);
	
	
	//改
	int updateUserById(User user);
	
	//查询所有
	List<User> findAll();
	
	//查询ID查询
	User findUserById(Integer id);
	
	//查询是否存在同一个username
	User findUserByName(String username);
	
	//根据Username查询发布的商品总数
	int CountShopPublish(String username);
	
	int CountShopPublishById(Integer userid);
}
