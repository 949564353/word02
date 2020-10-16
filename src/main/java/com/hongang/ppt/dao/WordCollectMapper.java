package com.hongang.ppt.dao;

import com.hongang.ppt.entity.WordCollect;
import com.hongang.ppt.entity.WordCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface WordCollectMapper extends Mapper<WordCollect> {
    long countByExample(WordCollectExample example);

    int deleteByExample(WordCollectExample example);

    List<WordCollect> selectByExample(WordCollectExample example);

    int updateByExampleSelective(@Param("record") WordCollect record, @Param("example") WordCollectExample example);

    int updateByExample(@Param("record") WordCollect record, @Param("example") WordCollectExample example);
}