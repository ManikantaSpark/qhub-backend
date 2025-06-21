package com.example.qhub.domain.model;

public class TestCoverageData {
    private String component;
    private int unit;
    private int integration;
    private int e2e;
    private int overall;

    public TestCoverageData(String component, int unit, int integration, int e2e, int overall) {
        this.component = component;
        this.unit = unit;
        this.integration = integration;
        this.e2e = e2e;
        this.overall = overall;
    }
    public String getComponent() { return component; }
    public int getUnit() { return unit; }
    public int getIntegration() { return integration; }
    public int getE2e() { return e2e; }
    public int getOverall() { return overall; }
}
