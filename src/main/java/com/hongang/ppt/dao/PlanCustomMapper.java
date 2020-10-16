package com.hongang.ppt.dao;

import com.hongang.ppt.entity.PlanCustom;
import com.hongang.ppt.entity.PlanCustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PlanCustomMapper extends Mapper<PlanCustom> {
    long countByExample(PlanCustomExample example);

    int deleteByExample(PlanCustomExample example);

    List<PlanCustom> selectByExample(PlanCustomExample example);

    int updateByExampleSelective(@Param("record") PlanCustom record, @Param("example") PlanCustomExample example);

    int updateByExample(@Param("record") PlanCustom record, @Param("example") PlanCustomExample example);
}
