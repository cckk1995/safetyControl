package com.chaikai.safetycontrol.pojo;

public class PkgNeed {
    private Integer supplyNeedId;

    private Integer supplyId;

    private Integer packageId;

    private Short expectedNum;

    private Short usedNum;

    private Short recycleNum;

    private String description;

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

    public Short getExpectedNum() {
        return expectedNum;
    }

    public void setExpectedNum(Short expectedNum) {
        this.expectedNum = expectedNum;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}