package com.chaikai.safetycontrol.pojo;

public class SupplyBind {
    private Integer supplyBindId;

    private Integer supplyProcedureId;

    private Integer supplyId;

    private String servStaffList;

    public Integer getSupplyBindId() {
        return supplyBindId;
    }

    public void setSupplyBindId(Integer supplyBindId) {
        this.supplyBindId = supplyBindId;
    }

    public Integer getSupplyProcedureId() {
        return supplyProcedureId;
    }

    public void setSupplyProcedureId(Integer supplyProcedureId) {
        this.supplyProcedureId = supplyProcedureId;
    }

    public Integer getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Integer supplyId) {
        this.supplyId = supplyId;
    }

    public String getServStaffList() {
        return servStaffList;
    }

    public void setServStaffList(String servStaffList) {
        this.servStaffList = servStaffList == null ? null : servStaffList.trim();
    }
}