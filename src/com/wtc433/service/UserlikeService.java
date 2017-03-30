package com.wtc433.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wtc433.domain.Userlike;
import com.wtc433.domain.UserlikeExample;

public interface UserlikeService {


    int deletelike(Integer id);

    boolean addlike(Userlike record);  //用户给商品点赞
    
    List<Userlike> getLikeByUserName(String username); //根据用户username 获得 赞的东西
    
    boolean deleteByShopAndUsername(String username,Integer shopid);//根据用户名和商品类型查看

    String isHavaLove(Userlike userlike); //判断是否有赞
    
    String isHavaLoveShow(Userlike userlike);//只是显示是否赞
    
    long countUserLikeByUsername(String username);
}
