package com.example.qhub.domain.model;

public class WebVitalsData {
    private String metric;
    private double score;
    private double threshold;
    private String status;

    public WebVitalsData(String metric, double score, double threshold, String status) {
        this.metric = metric;
        this.score = score;
        this.threshold = threshold;
        this.status = status;
    }
    public String getMetric() { return metric; }
    public double getScore() { return score; }
    public double getThreshold() { return threshold; }
    public String getStatus() { return status; }
}
