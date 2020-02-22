package com.chaikai.safetycontrol.dao;

import com.chaikai.safetycontrol.pojo.ProcNeed;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProcNeedMapper {
    int deleteByPrimaryKey(Integer supplyProcedureId);

    int insert(ProcNeed record);

    int insertSelective(ProcNeed record);

    ProcNeed selectByPrimaryKey(Integer supplyProcedureId);

    int updateByPrimaryKeySelective(ProcNeed record);

    int updateByPrimaryKey(ProcNeed record);

    List<ProcNeed> selectByCondition(ProcNeed record);
}