package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.ViolationAlert;

public interface ViolationAlertMapper {
    int deleteByPrimaryKey(Integer alertId);

    int insert(ViolationAlert record);

    int insertSelective(ViolationAlert record);

    ViolationAlert selectByPrimaryKey(Integer alertId);

    int updateByPrimaryKeySelective(ViolationAlert record);

    int updateByPrimaryKey(ViolationAlert record);
}