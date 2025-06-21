package com.example.qhub.domain.model;

public class PerformanceMetricsData {
    private String suite;
    private double avgTime;
    private double parallelTime;
    private int efficiency;

    public PerformanceMetricsData(String suite, double avgTime, double parallelTime, int efficiency) {
        this.suite = suite;
        this.avgTime = avgTime;
        this.parallelTime = parallelTime;
        this.efficiency = efficiency;
    }
    public String getSuite() { return suite; }
    public double getAvgTime() { return avgTime; }
    public double getParallelTime() { return parallelTime; }
    public int getEfficiency() { return efficiency; }
}
