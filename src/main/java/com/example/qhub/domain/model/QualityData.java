package com.example.qhub.domain.model;

public class QualityData {
    private String category;
    private int coverage;
    private int defects;

    public QualityData(String category, int coverage, int defects) {
        this.category = category;
        this.coverage = coverage;
        this.defects = defects;
    }
    public String getCategory() { return category; }
    public int getCoverage() { return coverage; }
    public int getDefects() { return defects; }
}
