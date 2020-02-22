package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.Violation;

public interface ViolationMapper {
    int deleteByPrimaryKey(Integer violationId);

    int insert(Violation record);

    int insertSelective(Violation record);

    Violation selectByPrimaryKey(Integer violationId);

    int updateByPrimaryKeySelective(Violation record);

    int updateByPrimaryKey(Violation record);
}