package com.wtc433.dao;

import com.wtc433.domain.Userlike;
import com.wtc433.domain.UserlikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserlikeMapper {
	
	long countByExample(UserlikeExample example);

	int deleteByExample(UserlikeExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Userlike record);

	int insertSelective(Userlike record);

	List<Userlike> selectByExample(UserlikeExample example);

	Userlike selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Userlike record, @Param("example") UserlikeExample example);

	int updateByExample(@Param("record") Userlike record, @Param("example") UserlikeExample example);

	int updateByPrimaryKeySelective(Userlike record);

	int updateByPrimaryKey(Userlike record);

	List<Userlike> getLikeByUserName(String username);

	int deleteByShopIdAndUsername(Integer shopid, String username);
	
	Userlike isHavaLove(Userlike userlike);
	
	long countUserLikeByUsername(String username);
	
}