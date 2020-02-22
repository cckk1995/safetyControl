package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.SupplyBind;

public interface SupplyBindMapper {
    int deleteByPrimaryKey(Integer supplyBindId);

    int insert(SupplyBind record);

    int insertSelective(SupplyBind record);

    SupplyBind selectByPrimaryKey(Integer supplyBindId);

    int updateByPrimaryKeySelective(SupplyBind record);

    int updateByPrimaryKey(SupplyBind record);
}