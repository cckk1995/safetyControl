package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.SafetySupply;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SafetySupplyMapper {
    int deleteByPrimaryKey(Integer supplyId);

    int insert(SafetySupply record);

    int insertSelective(SafetySupply record);

    SafetySupply selectByPrimaryKey(Integer supplyId);

    int updateByPrimaryKeySelective(SafetySupply record);

    int updateByPrimaryKey(SafetySupply record);

    List<SafetySupply> selectAll();
}