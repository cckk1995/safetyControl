package com.chaikai.safetycontrol.service.impl;

import com.chaikai.safetycontrol.dao.SafetySupplyMapper;
import com.chaikai.safetycontrol.pojo.SafetySupply;
import com.chaikai.safetycontrol.service.SafetySupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("SafetySupplyService")
public class SafetySupplyServiceImpl implements SafetySupplyService {

    @Autowired
    private SafetySupplyMapper safetySupplyMapper;

    @Override
    public List<SafetySupply> getAllSupply() {
        return safetySupplyMapper.selectAll();
    }

    @Override
    public SafetySupply getSupplyById(int supplyId) {
        return safetySupplyMapper.selectByPrimaryKey(supplyId);
    }

    @Override
    public int updateSupply(SafetySupply safetySupply) {
        return safetySupplyMapper.updateByPrimaryKey(safetySupply);
    }

    @Override
    public int updateSupplyPicture(int supplyId, String picture) {
        SafetySupply safetySupply = safetySupplyMapper.selectByPrimaryKey(supplyId);
        safetySupply.setPicture(picture);
        return safetySupplyMapper.updateByPrimaryKey(safetySupply);
    }
}
