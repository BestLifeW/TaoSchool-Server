package com.wtc433.dao;

import com.wtc433.domain.Publish;
import com.wtc433.domain.PublishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublishMapper {
    long countByExample(PublishExample example);

    int deleteByExample(PublishExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Publish record);

    int insertSelective(Publish record);

    List<Publish> selectByExample(PublishExample example);

    Publish selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Publish record, @Param("example") PublishExample example);

    int updateByExample(@Param("record") Publish record, @Param("example") PublishExample example);

    int updateByPrimaryKeySelective(Publish record);

    int updateByPrimaryKey(Publish record);
}