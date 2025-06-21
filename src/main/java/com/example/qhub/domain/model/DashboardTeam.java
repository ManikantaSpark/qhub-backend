package com.example.qhub.domain.model;

public class DashboardTeam {
    private String value;
    private String label;

    public DashboardTeam(String value, String label) {
        this.value = value;
        this.label = label;
    }
    public String getValue() { return value; }
    public String getLabel() { return label; }
}
