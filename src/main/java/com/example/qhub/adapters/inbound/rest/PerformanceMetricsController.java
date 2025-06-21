package com.example.qhub.adapters.inbound.rest;

import com.example.qhub.application.service.PerformanceMetricsService;
import com.example.qhub.domain.model.SystemPerformanceData;
import com.example.qhub.domain.model.ResponseTimeData;
import com.example.qhub.domain.model.WebVitalsData;
import com.example.qhub.domain.model.UptimeData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/performance-metrics")
public class PerformanceMetricsController {
    private final PerformanceMetricsService performanceMetricsService;

    public PerformanceMetricsController(PerformanceMetricsService performanceMetricsService) {
        this.performanceMetricsService = performanceMetricsService;
    }

    @GetMapping("/system-performance-data")
    public List<SystemPerformanceData> getSystemPerformanceData() {
        return performanceMetricsService.getSystemPerformanceData();
    }

    @GetMapping("/response-time-data")
    public List<ResponseTimeData> getResponseTimeData() {
        return performanceMetricsService.getResponseTimeData();
    }

    @GetMapping("/web-vitals-data")
    public List<WebVitalsData> getWebVitalsData() {
        return performanceMetricsService.getWebVitalsData();
    }

    @GetMapping("/uptime-data")
    public List<UptimeData> getUptimeData() {
        return performanceMetricsService.getUptimeData();
    }
}
