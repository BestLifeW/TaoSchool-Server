package com.wtc433.dao;

import com.wtc433.domain.Orders;
import com.wtc433.domain.OrdersExample;
import com.wtc433.domain.OrdersExt;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.logging.log4j.core.config.Order;

public interface OrdersMapper {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
    Orders selectByShopid(String shopid);
    
    List<Orders> findOrderByshopid(List<Integer> list);
    
    List<OrdersExt> findOrderByUsername(String username);
}