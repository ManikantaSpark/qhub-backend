package com.example.qhub.domain.model;

public class TestExecutionData {
    private String week;
    private int unit;
    private int integration;
    private int e2e;
    private int performance;
    private int total;

    public TestExecutionData(String week, int unit, int integration, int e2e, int performance, int total) {
        this.week = week;
        this.unit = unit;
        this.integration = integration;
        this.e2e = e2e;
        this.performance = performance;
        this.total = total;
    }
    public String getWeek() { return week; }
    public int getUnit() { return unit; }
    public int getIntegration() { return integration; }
    public int getE2e() { return e2e; }
    public int getPerformance() { return performance; }
    public int getTotal() { return total; }
}
