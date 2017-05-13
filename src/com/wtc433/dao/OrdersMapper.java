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

    int updateByPrimaryKey(@Param("id")Integer id, @Param("state")String state);
    
    Orders selectByShopid(String shopid);
    
 
    
    List<OrdersExt> findOrderByUsername(String username);

    List<OrdersExt> findOrderBuybuyer(String username);
    
    long countSallerByUsername(String username);

    OrdersExt findOrdersByshopid(String shopid);
    
    List<OrdersExt> findCompleteOrderByUsername(String username);
    
    List<OrdersExt> findOrderByCompleteBySaller(String username);
    
    List<OrdersExt> findOrderByCompleteByBuyer (String username);
}