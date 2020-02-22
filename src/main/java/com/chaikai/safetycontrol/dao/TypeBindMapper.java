package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.TypeBind;

public interface TypeBindMapper {
    int deleteByPrimaryKey(Integer bindId);

    int insert(TypeBind record);

    int insertSelective(TypeBind record);

    TypeBind selectByPrimaryKey(Integer bindId);

    int updateByPrimaryKeySelective(TypeBind record);

    int updateByPrimaryKey(TypeBind record);
}