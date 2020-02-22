package com.chaikai.safetycontrol.service;

import com.chaikai.safetycontrol.pojo.ProcNeed;
import com.chaikai.safetycontrol.pojo.VO.ProcNeedVO;

import java.util.List;

public interface ProcNeedService {
       List<ProcNeedVO> getProcNeedVOByCondition(ProcNeed procNeed);
}
