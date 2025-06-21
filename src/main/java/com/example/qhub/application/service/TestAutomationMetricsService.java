package com.example.qhub.application.service;

import com.example.qhub.domain.model.*;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class TestAutomationMetricsService {
    public List<TestExecutionData> getTestExecutionData() {
        return Arrays.asList(
            new TestExecutionData("Week 1", 2850, 456, 89, 12, 3407),
            new TestExecutionData("Week 2", 2920, 478, 95, 15, 3508),
            new TestExecutionData("Week 3", 3010, 489, 102, 18, 3619),
            new TestExecutionData("Week 4", 3085, 501, 108, 20, 3714)
        );
    }
    public List<TestCoverageData> getTestCoverageData() {
        return Arrays.asList(
            new TestCoverageData("Authentication", 95, 88, 75, 86),
            new TestCoverageData("Payment System", 92, 85, 70, 82),
            new TestCoverageData("User Management", 89, 80, 65, 78),
            new TestCoverageData("Reporting", 85, 75, 60, 73),
            new TestCoverageData("API Gateway", 98, 90, 80, 89)
        );
    }
    public List<TestTypeDistribution> getTestTypeDistribution() {
        return Arrays.asList(
            new TestTypeDistribution("Unit Tests", 70, "#10b981", 3085),
            new TestTypeDistribution("Integration Tests", 20, "#3b82f6", 501),
            new TestTypeDistribution("E2E Tests", 8, "#8b5cf6", 108),
            new TestTypeDistribution("Performance Tests", 2, "#f59e0b", 20)
        );
    }
    public List<TestReliabilityData> getTestReliabilityData() {
        return Arrays.asList(
            new TestReliabilityData("Mon", 98.5, 1.2, 0.3),
            new TestReliabilityData("Tue", 97.8, 1.8, 0.4),
            new TestReliabilityData("Wed", 98.9, 0.9, 0.2),
            new TestReliabilityData("Thu", 97.2, 2.3, 0.5),
            new TestReliabilityData("Fri", 99.1, 0.7, 0.2),
            new TestReliabilityData("Sat", 98.7, 1.1, 0.2),
            new TestReliabilityData("Sun", 98.4, 1.4, 0.2)
        );
    }
    public List<PerformanceMetricsData> getPerformanceMetricsData() {
        return Arrays.asList(
            new PerformanceMetricsData("Unit Tests", 8.5, 2.1, 75),
            new PerformanceMetricsData("Integration", 45.2, 12.3, 73),
            new PerformanceMetricsData("E2E Tests", 180.4, 35.7, 80),
            new PerformanceMetricsData("Load Tests", 420.8, 85.2, 80),
            new PerformanceMetricsData("Security", 25.6, 8.9, 65)
        );
    }
    public List<TestMaintenanceData> getTestMaintenanceData() {
        return Arrays.asList(
            new TestMaintenanceData("Jan", 145, 89, 23, 12),
            new TestMaintenanceData("Feb", 167, 95, 31, 8),
            new TestMaintenanceData("Mar", 189, 102, 28, 15),
            new TestMaintenanceData("Apr", 156, 87, 35, 10)
        );
    }
}
