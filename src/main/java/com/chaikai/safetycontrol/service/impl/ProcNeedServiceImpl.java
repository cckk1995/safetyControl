package com.chaikai.safetycontrol.service.impl;

import com.chaikai.safetycontrol.dao.ProcNeedMapper;
import com.chaikai.safetycontrol.dao.SafetySupplyMapper;
import com.chaikai.safetycontrol.pojo.ProcNeed;
import com.chaikai.safetycontrol.pojo.SafetySupply;
import com.chaikai.safetycontrol.pojo.VO.ProcNeedVO;
import com.chaikai.safetycontrol.service.ProcNeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("ProcNeedService")
public class ProcNeedServiceImpl implements ProcNeedService {

    @Autowired
    private ProcNeedMapper procNeedMapper;

    @Autowired
    private SafetySupplyMapper safetySupplyMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<ProcNeedVO> getProcNeedVOByCondition(ProcNeed procNeed) {
        List<ProcNeed> procNeeds = procNeedMapper.selectByCondition(procNeed);
        List<ProcNeedVO> procNeedVOS = new ArrayList<>();
        for(ProcNeed p : procNeeds) {
            int supplyId = p.getSupplyId();
            SafetySupply safetySupply = safetySupplyMapper.selectByPrimaryKey(supplyId);
            procNeedVOS.add(getProcNeedVO(p,safetySupply));
        }
        return procNeedVOS;
    }

    private ProcNeedVO getProcNeedVO(ProcNeed procNeed, SafetySupply safetySupply) {
        ProcNeedVO procNeedVO = new ProcNeedVO();
        procNeedVO.setSafetyProcedureId(procNeed.getSupplyProcedureId());
        procNeedVO.setSupplyId(procNeed.getSupplyId());
        procNeedVO.setName(safetySupply.getName());
        procNeedVO.setSpec(safetySupply.getSpec());
        procNeedVO.setPicture(safetySupply.getPicture());
        procNeedVO.setUsedNum(procNeed.getUsedNum());
        return procNeedVO;
    }
}
