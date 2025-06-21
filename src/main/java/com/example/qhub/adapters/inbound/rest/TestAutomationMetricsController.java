package com.example.qhub.adapters.inbound.rest;

import com.example.qhub.application.service.TestAutomationMetricsService;
import com.example.qhub.domain.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/test-automation-metrics")
public class TestAutomationMetricsController {
    private final TestAutomationMetricsService testAutomationMetricsService;

    public TestAutomationMetricsController(TestAutomationMetricsService testAutomationMetricsService) {
        this.testAutomationMetricsService = testAutomationMetricsService;
    }

    @GetMapping("/test-execution-data")
    public List<TestExecutionData> getTestExecutionData() {
        return testAutomationMetricsService.getTestExecutionData();
    }

    @GetMapping("/test-coverage-data")
    public List<TestCoverageData> getTestCoverageData() {
        return testAutomationMetricsService.getTestCoverageData();
    }

    @GetMapping("/test-type-distribution")
    public List<TestTypeDistribution> getTestTypeDistribution() {
        return testAutomationMetricsService.getTestTypeDistribution();
    }

    @GetMapping("/test-reliability-data")
    public List<TestReliabilityData> getTestReliabilityData() {
        return testAutomationMetricsService.getTestReliabilityData();
    }

    @GetMapping("/performance-metrics-data")
    public List<PerformanceMetricsData> getPerformanceMetricsData() {
        return testAutomationMetricsService.getPerformanceMetricsData();
    }

    @GetMapping("/test-maintenance-data")
    public List<TestMaintenanceData> getTestMaintenanceData() {
        return testAutomationMetricsService.getTestMaintenanceData();
    }
}
