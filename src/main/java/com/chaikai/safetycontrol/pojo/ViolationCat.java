package com.chaikai.safetycontrol.pojo;

public class ViolationCat {
    private Integer violationCategoryId;

    private String violationCategory;

    public Integer getViolationCategoryId() {
        return violationCategoryId;
    }

    public void setViolationCategoryId(Integer violationCategoryId) {
        this.violationCategoryId = violationCategoryId;
    }

    public String getViolationCategory() {
        return violationCategory;
    }

    public void setViolationCategory(String violationCategory) {
        this.violationCategory = violationCategory == null ? null : violationCategory.trim();
    }
}