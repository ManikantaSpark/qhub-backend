package com.example.qhub.domain.model;

public class SprintData {
    private String day;
    private int planned;
    private int completed;
    private int remaining;

    public SprintData(String day, int planned, int completed, int remaining) {
        this.day = day;
        this.planned = planned;
        this.completed = completed;
        this.remaining = remaining;
    }

    public String getDay() { return day; }
    public int getPlanned() { return planned; }
    public int getCompleted() { return completed; }
    public int getRemaining() { return remaining; }
}
