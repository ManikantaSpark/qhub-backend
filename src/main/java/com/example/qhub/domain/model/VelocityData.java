package com.example.qhub.domain.model;

public class VelocityData {
    private String sprint;
    private int committed;
    private int completed;

    public VelocityData(String sprint, int committed, int completed) {
        this.sprint = sprint;
        this.committed = committed;
        this.completed = completed;
    }
    public String getSprint() { return sprint; }
    public int getCommitted() { return committed; }
    public int getCompleted() { return completed; }
}
