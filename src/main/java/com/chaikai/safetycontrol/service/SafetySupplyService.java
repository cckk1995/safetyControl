package com.chaikai.safetycontrol.service;

import com.chaikai.safetycontrol.pojo.SafetySupply;

import java.util.List;

public interface SafetySupplyService {
    List<SafetySupply> getAllSupply();
    int updateSupply(SafetySupply safetySupply);
    SafetySupply getSupplyById(int supplyId);
    int updateSupplyPicture(int supplyId, String picture);
}
