package com.example.qhub.domain.model;

public class CycleTimeData {
    private String week;
    private double cycleTime;
    private int throughput;

    public CycleTimeData(String week, double cycleTime, int throughput) {
        this.week = week;
        this.cycleTime = cycleTime;
        this.throughput = throughput;
    }
    public String getWeek() { return week; }
    public double getCycleTime() { return cycleTime; }
    public int getThroughput() { return throughput; }
}
