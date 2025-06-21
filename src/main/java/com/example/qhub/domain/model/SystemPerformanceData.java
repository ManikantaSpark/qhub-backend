package com.example.qhub.domain.model;

public class SystemPerformanceData {
    private String time;
    private int cpu;
    private int memory;
    private int disk;
    private int network;

    public SystemPerformanceData(String time, int cpu, int memory, int disk, int network) {
        this.time = time;
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
        this.network = network;
    }
    public String getTime() { return time; }
    public int getCpu() { return cpu; }
    public int getMemory() { return memory; }
    public int getDisk() { return disk; }
    public int getNetwork() { return network; }
}
