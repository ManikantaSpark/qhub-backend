package com.example.qhub.domain.model;

public class FailureRateData {
    private String month;
    private double rate;

    public FailureRateData(String month, double rate) {
        this.month = month;
        this.rate = rate;
    }
    public String getMonth() { return month; }
    public double getRate() { return rate; }
}
