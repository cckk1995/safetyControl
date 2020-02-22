package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.ViolationFlow;

public interface ViolationFlowMapper {
    int deleteByPrimaryKey(Integer violationFlowId);

    int insert(ViolationFlow record);

    int insertSelective(ViolationFlow record);

    ViolationFlow selectByPrimaryKey(Integer violationFlowId);

    int updateByPrimaryKeySelective(ViolationFlow record);

    int updateByPrimaryKey(ViolationFlow record);
}