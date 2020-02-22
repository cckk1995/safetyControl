package com.chaikai.safetycontrol.pojo;

import java.util.Date;

public class ViolationFlow {
    private Integer violationFlowId;

    private Integer violationId;

    private Byte status;

    private String byWho;

    private Date inTime;

    private String description;

    public Integer getViolationFlowId() {
        return violationFlowId;
    }

    public void setViolationFlowId(Integer violationFlowId) {
        this.violationFlowId = violationFlowId;
    }

    public Integer getViolationId() {
        return violationId;
    }

    public void setViolationId(Integer violationId) {
        this.violationId = violationId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getByWho() {
        return byWho;
    }

    public void setByWho(String byWho) {
        this.byWho = byWho == null ? null : byWho.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}