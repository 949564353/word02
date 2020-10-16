package com.hongang.ppt.dao;

import com.hongang.ppt.entity.AppSearch;
import com.hongang.ppt.entity.AppSearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AppSearchMapper extends Mapper<AppSearch> {
    long countByExample(AppSearchExample example);

    int deleteByExample(AppSearchExample example);

    List<AppSearch> selectByExample(AppSearchExample example);

    int updateByExampleSelective(@Param("record") AppSearch record, @Param("example") AppSearchExample example);

    int updateByExample(@Param("record") AppSearch record, @Param("example") AppSearchExample example);
}