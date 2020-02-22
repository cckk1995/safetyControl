package com.chaikai.safetycontrol.pojo;

import java.util.Date;

public class FacilityChangeApplication {
    private Integer applicationId;

    private Integer aupplyId;

    private Integer packageId;

    private Integer procedureId;

    private Integer applicantId;

    private String description;

    private Date promisedRecoveryTime;

    private String picture;

    private String status;

    private Date changeTime;

    private Date recoveryTime;

    private Boolean applicationType;

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getAupplyId() {
        return aupplyId;
    }

    public void setAupplyId(Integer aupplyId) {
        this.aupplyId = aupplyId;
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

    public Integer getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getPromisedRecoveryTime() {
        return promisedRecoveryTime;
    }

    public void setPromisedRecoveryTime(Date promisedRecoveryTime) {
        this.promisedRecoveryTime = promisedRecoveryTime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public Date getRecoveryTime() {
        return recoveryTime;
    }

    public void setRecoveryTime(Date recoveryTime) {
        this.recoveryTime = recoveryTime;
    }

    public Boolean getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(Boolean applicationType) {
        this.applicationType = applicationType;
    }
}