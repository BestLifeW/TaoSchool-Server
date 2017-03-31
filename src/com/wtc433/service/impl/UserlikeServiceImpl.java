package com.wtc433.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtc433.dao.UserMapper;
import com.wtc433.dao.UserlikeMapper;
import com.wtc433.domain.Userlike;
import com.wtc433.service.UserlikeService;

@Service
public class UserlikeServiceImpl implements UserlikeService {

	@Autowired
	private UserlikeMapper userLikeMapper;

	/**
	 * 根据
	 */
	@Override
	public int deletelike(Integer id) {

		return userLikeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public boolean addlike(Userlike record) {
		int insert = userLikeMapper.insert(record);
		if (insert != 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Userlike> getLikeByUserName(String username) {

		return userLikeMapper.getLikeByUserName(username);
	}

	/**
	 * 根据用户和商品Id删除
	 */
	@Override
	public boolean deleteByShopAndUsername(String username, Integer shopid) {

		int getResult = userLikeMapper.deleteByShopIdAndUsername(shopid, username);
		if (getResult != 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String isHavaLove(Userlike userlike) {

		int deleteByShopIdAndUsername = userLikeMapper.deleteByShopIdAndUsername(userlike.getShopid(),
				userlike.getUsername());

		if (deleteByShopIdAndUsername != 0) {
			System.out.println(userlike.toString());
			System.out.println("要删除的Id是" + userlike.getId());
			userLikeMapper.deleteByPrimaryKey(userlike.getId());
			return "删除成功";
		} else {
			userLikeMapper.insert(userlike);
			return "插入成功";
		}

	}

	@Override
	public String isHavaLoveShow(Userlike userlike) {

		Userlike havaLove = userLikeMapper.isHavaLove(userlike);

		if (havaLove != null) {
			return "1";
		} else {
			return "0";
		}

	}

	@Override
	public long countUserLikeByUsername(String username) {
		
		
		
		return userLikeMapper.countUserLikeByUsername(username);
	}

}
