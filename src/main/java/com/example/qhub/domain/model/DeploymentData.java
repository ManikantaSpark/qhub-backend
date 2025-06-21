package com.example.qhub.domain.model;

public class DeploymentData {
    private String date;
    private int deployments;
    private int success;

    public DeploymentData(String date, int deployments, int success) {
        this.date = date;
        this.deployments = deployments;
        this.success = success;
    }
    public String getDate() { return date; }
    public int getDeployments() { return deployments; }
    public int getSuccess() { return success; }
}
