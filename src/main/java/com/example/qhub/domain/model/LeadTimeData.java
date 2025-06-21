package com.example.qhub.domain.model;

public class LeadTimeData {
    private String metric;
    private double hours;

    public LeadTimeData(String metric, double hours) {
        this.metric = metric;
        this.hours = hours;
    }
    public String getMetric() { return metric; }
    public double getHours() { return hours; }
}
