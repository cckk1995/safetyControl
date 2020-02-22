package com.chaikai.safetycontrol.controller;

import com.chaikai.safetycontrol.pojo.SafetySupply;
import com.chaikai.safetycontrol.service.SafetySupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/supply")
public class SafetySupplyController {

    @Autowired
    private SafetySupplyService safetySupplyService;

    @RequestMapping(value = "/getAllSupply",method = RequestMethod.GET)
    @ResponseBody
    public List<SafetySupply> getAllSupply() {
        return safetySupplyService.getAllSupply();
    }

    @RequestMapping(value = "/updateSupply",method = RequestMethod.POST)
    @ResponseBody
    public int updateSupply(@ModelAttribute SafetySupply safetySupply) {
        return safetySupplyService.updateSupply(safetySupply);
    }

    @RequestMapping(value = "/getSupplyById",method = RequestMethod.GET)
    @ResponseBody
    public SafetySupply getSupplyById(@RequestParam(value = "supplyId") int supplyId) {
        return safetySupplyService.getSupplyById(supplyId);
    }

    @RequestMapping(value = "/updateSupplyPicture", method = RequestMethod.POST)
    @ResponseBody
    public int updateSupplyPicture(@RequestParam(value = "supplyId") int supplyId, @RequestParam(value = "picture") String picture) {
        return safetySupplyService.updateSupplyPicture(supplyId,picture);
    }
}
