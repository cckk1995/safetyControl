package com.chaikai.safetycontrol.pojo;

import java.util.Date;

public class Violation {
    private Integer violationId;

    private Integer violationCategoryId;

    private Integer packageId;

    private Integer procedureId;

    private String violator;

    private Integer alertId;

    private String status;

    private String description;

    private Date startTime;

    private Date endTime;

    public Integer getViolationId() {
        return violationId;
    }

    public void setViolationId(Integer violationId) {
        this.violationId = violationId;
    }

    public Integer getViolationCategoryId() {
        return violationCategoryId;
    }

    public void setViolationCategoryId(Integer violationCategoryId) {
        this.violationCategoryId = violationCategoryId;
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

    public String getViolator() {
        return violator;
    }

    public void setViolator(String violator) {
        this.violator = violator == null ? null : violator.trim();
    }

    public Integer getAlertId() {
        return alertId;
    }

    public void setAlertId(Integer alertId) {
        this.alertId = alertId;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}