package com.chaikai.safetycontrol.controller;

import com.chaikai.safetycontrol.pojo.ProcNeed;
import com.chaikai.safetycontrol.pojo.VO.ProcNeedVO;
import com.chaikai.safetycontrol.service.ProcNeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/procNeed")
public class ProcNeedController {

    @Autowired
    private ProcNeedService procNeedService;

    @RequestMapping(value = "/getProcNeedByCondition",method = RequestMethod.GET)
    @ResponseBody
    public List<ProcNeedVO> getProcNeedByCondition(@ModelAttribute ProcNeed procNeed) {
        return procNeedService.getProcNeedVOByCondition(procNeed);
    }

}
