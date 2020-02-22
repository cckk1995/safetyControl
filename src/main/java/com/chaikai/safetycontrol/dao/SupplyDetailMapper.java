package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.SupplyDetail;

public interface SupplyDetailMapper {
    int deleteByPrimaryKey(Integer supplyDetailId);

    int insert(SupplyDetail record);

    int insertSelective(SupplyDetail record);

    SupplyDetail selectByPrimaryKey(Integer supplyDetailId);

    int updateByPrimaryKeySelective(SupplyDetail record);

    int updateByPrimaryKey(SupplyDetail record);
}