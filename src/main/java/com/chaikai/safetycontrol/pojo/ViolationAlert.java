package com.chaikai.safetycontrol.pojo;

public class ViolationAlert {
    private Integer alertId;

    private String alertInfo;

    public Integer getAlertId() {
        return alertId;
    }

    public void setAlertId(Integer alertId) {
        this.alertId = alertId;
    }

    public String getAlertInfo() {
        return alertInfo;
    }

    public void setAlertInfo(String alertInfo) {
        this.alertInfo = alertInfo == null ? null : alertInfo.trim();
    }
}