package com.wtc433.dao;

import com.wtc433.domain.Inquiry;
import com.wtc433.domain.InquiryExample;
import com.wtc433.domain.Shop;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InquiryMapper {
    long countByExample(InquiryExample example);

    int deleteByExample(InquiryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Inquiry record);

    int insertSelective(Inquiry record);

    List<Inquiry> selectByExample(InquiryExample example);

    Inquiry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Inquiry record, @Param("example") InquiryExample example);

    int updateByExample(@Param("record") Inquiry record, @Param("example") InquiryExample example);

    int updateByPrimaryKeySelective(Inquiry record);

    int updateByPrimaryKey(Inquiry record);
    
    List<Inquiry> findAll();
}