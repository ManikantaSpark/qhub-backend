package com.example.qhub.domain.model;

public class CodeQualityBarChartItem {
    private String name;
    private double value;
    private String shortName;

    public CodeQualityBarChartItem(String name, double value, String shortName) {
        this.name = name;
        this.value = value;
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getShortName() {
        return shortName;
    }
}
