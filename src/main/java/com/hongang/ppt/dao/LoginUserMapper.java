package com.hongang.ppt.dao;

import com.hongang.ppt.entity.LoginUser;
import com.hongang.ppt.entity.LoginUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface LoginUserMapper extends Mapper<LoginUser> {
    long countByExample(LoginUserExample example);

    int deleteByExample(LoginUserExample example);

    List<LoginUser> selectByExample(LoginUserExample example);

    int updateByExampleSelective(@Param("record") LoginUser record, @Param("example") LoginUserExample example);

    int updateByExample(@Param("record") LoginUser record, @Param("example") LoginUserExample example);
}
