package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.ViolationCat;

public interface ViolationCatMapper {
    int deleteByPrimaryKey(Integer violationCategoryId);

    int insert(ViolationCat record);

    int insertSelective(ViolationCat record);

    ViolationCat selectByPrimaryKey(Integer violationCategoryId);

    int updateByPrimaryKeySelective(ViolationCat record);

    int updateByPrimaryKey(ViolationCat record);
}