package com.xiaoweiyunchuang.orderfood.mapper;

import com.xiaoweiyunchuang.orderfood.domain.SysConfig;

public interface SysConfigMapper {
    int deleteByPrimaryKey(String cfgId);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(String cfgId);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}