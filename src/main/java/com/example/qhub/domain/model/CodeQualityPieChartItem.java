package com.example.qhub.domain.model;

public class CodeQualityPieChartItem {
    private String name;
    private double value;

    public CodeQualityPieChartItem(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
