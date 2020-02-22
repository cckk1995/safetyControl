package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.FacilityDeploy;
import org.springframework.stereotype.Component;

@Component
public interface FacilityDeployMapper {
    int deleteByPrimaryKey(Integer deployId);

    int insert(FacilityDeploy record);

    int insertSelective(FacilityDeploy record);

    FacilityDeploy selectByPrimaryKey(Integer deployId);

    int updateByPrimaryKeySelective(FacilityDeploy record);

    int updateByPrimaryKey(FacilityDeploy record);
}