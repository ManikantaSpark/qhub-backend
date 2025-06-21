package com.example.qhub.domain.model;

public class ResponseTimeData {
    private String endpoint;
    private int avgTime;
    private int p95;
    private int p99;

    public ResponseTimeData(String endpoint, int avgTime, int p95, int p99) {
        this.endpoint = endpoint;
        this.avgTime = avgTime;
        this.p95 = p95;
        this.p99 = p99;
    }
    public String getEndpoint() { return endpoint; }
    public int getAvgTime() { return avgTime; }
    public int getP95() { return p95; }
    public int getP99() { return p99; }
}
