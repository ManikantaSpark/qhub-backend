package com.example.qhub.application.service;

import com.example.qhub.domain.model.SprintData;
import com.example.qhub.domain.model.VelocityData;
import com.example.qhub.domain.model.CycleTimeData;
import com.example.qhub.domain.model.QualityData;
import com.example.qhub.domain.model.PrMetricsData;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class AgileMetricsService {
    public List<SprintData> getSprintData() {
        return Arrays.asList(
            new SprintData("Day 1", 100, 5, 95),
            new SprintData("Day 3", 100, 20, 80),
            new SprintData("Day 5", 100, 40, 60),
            new SprintData("Day 7", 100, 65, 35),
            new SprintData("Day 9", 100, 85, 15),
            new SprintData("Day 10", 100, 100, 0)
        );
    }

    public List<VelocityData> getVelocityData() {
        return Arrays.asList(
            new VelocityData("Sprint 1", 45, 42),
            new VelocityData("Sprint 2", 48, 48),
            new VelocityData("Sprint 3", 52, 49),
            new VelocityData("Sprint 4", 50, 53),
            new VelocityData("Sprint 5", 55, 54),
            new VelocityData("Sprint 6", 58, 58)
        );
    }

    public List<CycleTimeData> getCycleTimeData() {
        return Arrays.asList(
            new CycleTimeData("Week 1", 4.2, 12),
            new CycleTimeData("Week 2", 3.8, 15),
            new CycleTimeData("Week 3", 4.5, 11),
            new CycleTimeData("Week 4", 3.2, 18),
            new CycleTimeData("Week 5", 3.6, 16),
            new CycleTimeData("Week 6", 3.1, 19)
        );
    }

    public List<QualityData> getQualityData() {
        return Arrays.asList(
            new QualityData("Unit Tests", 85, 2),
            new QualityData("Integration Tests", 78, 4),
            new QualityData("E2E Tests", 65, 1),
            new QualityData("Manual Tests", 92, 3),
            new QualityData("Security Tests", 70, 0)
        );
    }

    public List<PrMetricsData> getPrMetricsData() {
        return Arrays.asList(
            new PrMetricsData("Avg Review Time", "4.2 hours", "-1.2h"),
            new PrMetricsData("PR Size (Lines)", "185", "-45"),
            new PrMetricsData("Approval Rate", "94.2%", "+2.1%"),
            new PrMetricsData("Merge Time", "6.8 hours", "-2.1h")
        );
    }
}
