package com.example.qhub.domain.model;

public class TestReliabilityData {
    private String day;
    private double passed;
    private double failed;
    private double flaky;

    public TestReliabilityData(String day, double passed, double failed, double flaky) {
        this.day = day;
        this.passed = passed;
        this.failed = failed;
        this.flaky = flaky;
    }
    public String getDay() { return day; }
    public double getPassed() { return passed; }
    public double getFailed() { return failed; }
    public double getFlaky() { return flaky; }
}
