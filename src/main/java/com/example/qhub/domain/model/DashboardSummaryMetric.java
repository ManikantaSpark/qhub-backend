package com.example.qhub.domain.model;

public class DashboardSummaryMetric {
    private String title;
    private String value;
    private String change;
    private String trend;
    private String icon;
    private String color;
    private String bgColor;
    private String borderColor;
    private String section;

    public DashboardSummaryMetric(String title, String value, String change, String trend, String icon, String color, String bgColor, String borderColor, String section) {
        this.title = title;
        this.value = value;
        this.change = change;
        this.trend = trend;
        this.icon = icon;
        this.color = color;
        this.bgColor = bgColor;
        this.borderColor = borderColor;
        this.section = section;
    }
    public String getTitle() { return title; }
    public String getValue() { return value; }
    public String getChange() { return change; }
    public String getTrend() { return trend; }
    public String getIcon() { return icon; }
    public String getColor() { return color; }
    public String getBgColor() { return bgColor; }
    public String getBorderColor() { return borderColor; }
    public String getSection() { return section; }
}
