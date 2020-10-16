package com.hongang.ppt.dao;

import com.hongang.ppt.entity.WordInfo;
import com.hongang.ppt.entity.WordInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface WordInfoMapper extends Mapper<WordInfo> {
    long countByExample(WordInfoExample example);

    int deleteByExample(WordInfoExample example);

    List<WordInfo> selectByExample(WordInfoExample example);

    int updateByExampleSelective(@Param("record") WordInfo record, @Param("example") WordInfoExample example);

    int updateByExample(@Param("record") WordInfo record, @Param("example") WordInfoExample example);
}