package com.chaikai.safetycontrol.pojo;


public class ProcNeed {
    private Integer supplyProcedureId;

    private Integer supplyNeedId;

    private Integer supplyId;

    private Integer packageId;

    private Integer procedureId;

    private Short usedNum;

    private Short recycleNum;

    private Boolean isChecked;

    private Integer deployId;

    private String description;

    public Integer getSupplyProcedureId() {
        return supplyProcedureId;
    }

    public void setSupplyProcedureId(Integer supplyProcedureId) {
        this.supplyProcedureId = supplyProcedureId;
    }

    public Integer getSupplyNeedId() {
        return supplyNeedId;
    }

    public void setSupplyNeedId(Integer supplyNeedId) {
        this.supplyNeedId = supplyNeedId;
    }

    public Integer getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Integer supplyId) {
        this.supplyId = supplyId;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Integer getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(Integer procedureId) {
        this.procedureId = procedureId;
    }

    public Short getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Short usedNum) {
        this.usedNum = usedNum;
    }

    public Short getRecycleNum() {
        return recycleNum;
    }

    public void setRecycleNum(Short recycleNum) {
        this.recycleNum = recycleNum;
    }

    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

    public Integer getDeployId() {
        return deployId;
    }

    public void setDeployId(Integer deployId) {
        this.deployId = deployId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}