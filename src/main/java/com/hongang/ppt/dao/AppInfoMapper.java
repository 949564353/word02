package com.hongang.ppt.dao;

import com.hongang.ppt.entity.AppInfo;
import com.hongang.ppt.entity.AppInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AppInfoMapper extends Mapper<AppInfo> {
    long countByExample(AppInfoExample example);

    int deleteByExample(AppInfoExample example);

    List<AppInfo> selectByExample(AppInfoExample example);

    int updateByExampleSelective(@Param("record") AppInfo record, @Param("example") AppInfoExample example);

    int updateByExample(@Param("record") AppInfo record, @Param("example") AppInfoExample example);
}
