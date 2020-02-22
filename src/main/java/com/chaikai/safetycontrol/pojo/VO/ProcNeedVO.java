package com.chaikai.safetycontrol.pojo.VO;

public class ProcNeedVO {
    private int safetyProcedureId;
    private int supplyId;
    private String picture;
    private String name;
    private String spec;
    private int usedNum;

    public int getSafetyProcedureId() {
        return safetyProcedureId;
    }

    public void setSafetyProcedureId(int safetyProcedureId) {
        this.safetyProcedureId = safetyProcedureId;
    }

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(int usedNum) {
        this.usedNum = usedNum;
    }
}
