package com.example.qhub.domain.model;

public class DashboardMenuItem {
    private String id;
    private String title;
    private String icon;
    private String description;

    public DashboardMenuItem(String id, String title, String icon, String description) {
        this.id = id;
        this.title = title;
        this.icon = icon;
        this.description = description;
    }
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getIcon() { return icon; }
    public String getDescription() { return description; }
}
