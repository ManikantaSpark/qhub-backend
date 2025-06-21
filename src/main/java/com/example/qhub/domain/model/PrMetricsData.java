package com.example.qhub.domain.model;

public class PrMetricsData {
    private String metric;
    private String value;
    private String change;

    public PrMetricsData(String metric, String value, String change) {
        this.metric = metric;
        this.value = value;
        this.change = change;
    }
    public String getMetric() { return metric; }
    public String getValue() { return value; }
    public String getChange() { return change; }
}
