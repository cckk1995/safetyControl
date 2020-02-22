package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.SupplyCategory;

public interface SupplyCategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(SupplyCategory record);

    int insertSelective(SupplyCategory record);

    SupplyCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(SupplyCategory record);

    int updateByPrimaryKey(SupplyCategory record);
}