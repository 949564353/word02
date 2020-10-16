package com.hongang.ppt.dao;

import com.hongang.ppt.entity.AppPlan;
import com.hongang.ppt.entity.AppPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AppPlanMapper extends Mapper<AppPlan> {
    long countByExample(AppPlanExample example);

    int deleteByExample(AppPlanExample example);

    List<AppPlan> selectByExample(AppPlanExample example);

    int updateByExampleSelective(@Param("record") AppPlan record, @Param("example") AppPlanExample example);

    int updateByExample(@Param("record") AppPlan record, @Param("example") AppPlanExample example);
}
