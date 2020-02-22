package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.FacilityChangeApplication;

public interface FacilityChangeApplicationMapper {
    int deleteByPrimaryKey(Integer applicationId);

    int insert(FacilityChangeApplication record);

    int insertSelective(FacilityChangeApplication record);

    FacilityChangeApplication selectByPrimaryKey(Integer applicationId);

    int updateByPrimaryKeySelective(FacilityChangeApplication record);

    int updateByPrimaryKey(FacilityChangeApplication record);
}