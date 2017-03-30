package com.wtc433.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtc433.dao.UserMapper;
import com.wtc433.domain.User;
import com.wtc433.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper UserMapper;
	
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		UserMapper.insert(user);
	}

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		UserMapper.deleteByPrimaryKey(id);
	}

	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		
		List<User> users = UserMapper.selectAllUser();
		return users;
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		User user = UserMapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	public int updateUserById(User user) {
		System.out.println("更新的方法"+user.toString());
		return UserMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		return UserMapper.findUserByName(username);
	}
	

	@Override
	public int CountShopPublish(String username) {
		// TODO Auto-generated method stub
		//统计 用户发布的数目
		return UserMapper.CountShopPublish(username);
	}

	@Override
	public int CountShopPublishById(Integer userid) {
		// TODO Auto-generated method stub
		return UserMapper.CountShopPublishById(userid);
	}

}
