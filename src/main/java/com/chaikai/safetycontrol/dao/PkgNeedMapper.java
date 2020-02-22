package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.PkgNeed;

public interface PkgNeedMapper {
    int deleteByPrimaryKey(Integer supplyNeedId);

    int insert(PkgNeed record);

    int insertSelective(PkgNeed record);

    PkgNeed selectByPrimaryKey(Integer supplyNeedId);

    int updateByPrimaryKeySelective(PkgNeed record);

    int updateByPrimaryKey(PkgNeed record);
}