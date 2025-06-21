package com.example.qhub.domain.model;

public class MttrData {
    private String severity;
    private int minutes;

    public MttrData(String severity, int minutes) {
        this.severity = severity;
        this.minutes = minutes;
    }
    public String getSeverity() { return severity; }
    public int getMinutes() { return minutes; }
}
