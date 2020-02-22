package com.chaikai.safetycontrol.pojo;

public class FacilityDeploy {
    private Integer deployId;

    private Integer packageId;

    private Integer procedureId;

    private Integer typeId;

    private Integer facilityDetailId;

    private String permitPersionList;

    private String picture;

    private String description;

    public Integer getDeployId() {
        return deployId;
    }

    public void setDeployId(Integer deployId) {
        this.deployId = deployId;
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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getFacilityDetailId() {
        return facilityDetailId;
    }

    public void setFacilityDetailId(Integer facilityDetailId) {
        this.facilityDetailId = facilityDetailId;
    }

    public String getPermitPersionList() {
        return permitPersionList;
    }

    public void setPermitPersionList(String permitPersionList) {
        this.permitPersionList = permitPersionList == null ? null : permitPersionList.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}