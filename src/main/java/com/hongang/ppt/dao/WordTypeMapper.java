package com.hongang.ppt.dao;

import com.hongang.ppt.entity.WordType;
import com.hongang.ppt.entity.WordTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface WordTypeMapper extends Mapper<WordType> {
    long countByExample(WordTypeExample example);

    int deleteByExample(WordTypeExample example);

    List<WordType> selectByExampleWithBLOBs(WordTypeExample example);

    List<WordType> selectByExample(WordTypeExample example);

    int updateByExampleSelective(@Param("record") WordType record, @Param("example") WordTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") WordType record, @Param("example") WordTypeExample example);

    int updateByExample(@Param("record") WordType record, @Param("example") WordTypeExample example);
}