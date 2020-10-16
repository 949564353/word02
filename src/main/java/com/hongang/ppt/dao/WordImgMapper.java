package com.hongang.ppt.dao;

import com.hongang.ppt.entity.WordImg;
import com.hongang.ppt.entity.WordImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface WordImgMapper extends Mapper<WordImg> {
    long countByExample(WordImgExample example);

    int deleteByExample(WordImgExample example);

    List<WordImg> selectByExample(WordImgExample example);

    int updateByExampleSelective(@Param("record") WordImg record, @Param("example") WordImgExample example);

    int updateByExample(@Param("record") WordImg record, @Param("example") WordImgExample example);
}