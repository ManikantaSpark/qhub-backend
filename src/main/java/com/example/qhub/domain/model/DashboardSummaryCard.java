package com.example.qhub.domain.model;

public class DashboardSummaryCard {
    private String value;
    private String label;
    private String sublabel;
    private String icon;
    private String bgColor;
    private String section;

    public DashboardSummaryCard(String value, String label, String sublabel, String icon, String bgColor, String section) {
        this.value = value;
        this.label = label;
        this.sublabel = sublabel;
        this.icon = icon;
        this.bgColor = bgColor;
        this.section = section;
    }
    public String getValue() { return value; }
    public String getLabel() { return label; }
    public String getSublabel() { return sublabel; }
    public String getIcon() { return icon; }
    public String getBgColor() { return bgColor; }
    public String getSection() { return section; }
}
