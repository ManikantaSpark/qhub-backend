package com.example.qhub.domain.model;

public class UptimeData {
    private String service;
    private double uptime;

    public UptimeData(String service, double uptime) {
        this.service = service;
        this.uptime = uptime;
    }
    public String getService() { return service; }
    public double getUptime() { return uptime; }
}
