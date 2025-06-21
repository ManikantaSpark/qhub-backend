package com.example.qhub.domain.model;

public class TestTypeDistribution {
    private String name;
    private int value;
    private String color;
    private int count;

    public TestTypeDistribution(String name, int value, String color, int count) {
        this.name = name;
        this.value = value;
        this.color = color;
        this.count = count;
    }
    public String getName() { return name; }
    public int getValue() { return value; }
    public String getColor() { return color; }
    public int getCount() { return count; }
}
