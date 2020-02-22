package com.chaikai.safetycontrol.pojo;

public class SupplyDetail {
    private Integer supplyDetailId;

    private Integer alertId;

    private Integer supplyId;

    private String status;

    private String description;

    public Integer getSupplyDetailId() {
        return supplyDetailId;
    }

    public void setSupplyDetailId(Integer supplyDetailId) {
        this.supplyDetailId = supplyDetailId;
    }

    public Integer getAlertId() {
        return alertId;
    }

    public void setAlertId(Integer alertId) {
        this.alertId = alertId;
    }

    public Integer getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Integer supplyId) {
        this.supplyId = supplyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}