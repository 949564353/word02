package com.hongang.ppt.dao;

import com.hongang.ppt.entity.AppOrder;
import com.hongang.ppt.entity.AppOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AppOrderMapper extends Mapper<AppOrder> {
    long countByExample(AppOrderExample example);

    int deleteByExample(AppOrderExample example);

    List<AppOrder> selectByExample(AppOrderExample example);

    int updateByExampleSelective(@Param("record") AppOrder record, @Param("example") AppOrderExample example);

    int updateByExample(@Param("record") AppOrder record, @Param("example") AppOrderExample example);
}
