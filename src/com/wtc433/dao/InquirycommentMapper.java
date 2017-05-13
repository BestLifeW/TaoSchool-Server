package com.wtc433.dao;

import com.wtc433.domain.Inquirycomment;
import com.wtc433.domain.InquirycommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InquirycommentMapper {
    long countByExample(InquirycommentExample example);

    int deleteByExample(InquirycommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Inquirycomment record);

    int insertSelective(Inquirycomment record);

    List<Inquirycomment> selectByExample(InquirycommentExample example);

    Inquirycomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Inquirycomment record, @Param("example") InquirycommentExample example);

    int updateByExample(@Param("record") Inquirycomment record, @Param("example") InquirycommentExample example);

    int updateByPrimaryKeySelective(Inquirycomment record);

    int updateByPrimaryKey(Inquirycomment record);
    
    List<Inquirycomment> getCommentByInquiryid(Integer id);
}