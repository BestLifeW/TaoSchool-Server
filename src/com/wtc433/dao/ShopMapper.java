package com.wtc433.dao;

import com.wtc433.domain.SubmitDetail;
import com.wtc433.domain.Shop;
import com.wtc433.domain.ShopExample;
import com.wtc433.domain.ShopExt;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    long countByExample(ShopExample example);

	int deleteByExample(ShopExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Shop record);

	int insertSelective(Shop record);

	List<Shop> selectByExample(ShopExample example);


	int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

	int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

	int updateByPrimaryKeySelective(Shop record);

	int updateByPrimaryKey(Shop record);

    List<Shop> findAll();
    
    List<Shop> findShopByName(String shopname);
    
    List<ShopExt> findShopAndUser();
  
    ShopExt selectByPrimaryKey(Integer id);

    SubmitDetail findSubmitDetailByShopId(@Param(value="id") Integer id,@Param(value="username") String username);
}