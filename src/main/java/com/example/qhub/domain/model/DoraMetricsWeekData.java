package com.example.qhub.domain.model;

public class DoraMetricsWeekData {
    private String id;
    private String week;
    private int deployment_count;
    private double lead_time_p50;
    private double lead_time_p90;
    private double lead_time_p95;
    private double failure_rate;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getWeek() { return week; }
    public void setWeek(String week) { this.week = week; }
    public int getDeployment_count() { return deployment_count; }
    public void setDeployment_count(int deployment_count) { this.deployment_count = deployment_count; }
    public double getLead_time_p50() { return lead_time_p50; }
    public void setLead_time_p50(double lead_time_p50) { this.lead_time_p50 = lead_time_p50; }
    public double getLead_time_p90() { return lead_time_p90; }
    public void setLead_time_p90(double lead_time_p90) { this.lead_time_p90 = lead_time_p90; }
    public double getLead_time_p95() { return lead_time_p95; }
    public void setLead_time_p95(double lead_time_p95) { this.lead_time_p95 = lead_time_p95; }
    public double getFailure_rate() { return failure_rate; }
    public void setFailure_rate(double failure_rate) { this.failure_rate = failure_rate; }
}
