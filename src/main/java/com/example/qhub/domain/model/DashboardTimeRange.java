package com.example.qhub.domain.model;

public class DashboardTimeRange {
    private String value;
    private String label;

    public DashboardTimeRange(String value, String label) {
        this.value = value;
        this.label = label;
    }
    public String getValue() { return value; }
    public String getLabel() { return label; }
}
