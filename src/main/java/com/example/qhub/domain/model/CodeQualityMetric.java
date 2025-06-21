package com.example.qhub.domain.model;

public class CodeQualityMetric {
    private String label;
    private Object value;
    private String source;
    private String icon;

    public CodeQualityMetric(String label, Object value, String source, String icon) {
        this.label = label;
        this.value = value;
        this.source = source;
        this.icon = icon;
    }

    public String getLabel() {
        return label;
    }

    public Object getValue() {
        return value;
    }

    public String getSource() {
        return source;
    }

    public String getIcon() {
        return icon;
    }
}
