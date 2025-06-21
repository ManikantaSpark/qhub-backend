package com.example.qhub.adapters.inbound.rest;

import com.example.qhub.application.service.CodeQualityMetricsService;
import com.example.qhub.domain.model.CodeQualityMetric;
import com.example.qhub.domain.model.CodeQualityBarChartItem;
import com.example.qhub.domain.model.CodeQualityPieChartItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/code-quality-metrics")
public class CodeQualityMetricsController {
    private final CodeQualityMetricsService codeQualityMetricsService;

    public CodeQualityMetricsController(CodeQualityMetricsService codeQualityMetricsService) {
        this.codeQualityMetricsService = codeQualityMetricsService;
    }

    @GetMapping("/main")
    public List<CodeQualityMetric> getMainMetrics() {
        return codeQualityMetricsService.getMainMetrics();
    }

    @GetMapping("/bar")
    public List<CodeQualityBarChartItem> getBarChartData() {
        return codeQualityMetricsService.getBarChartData();
    }

    @GetMapping("/pie")
    public List<CodeQualityPieChartItem> getPieChartData() {
        return codeQualityMetricsService.getPieChartData();
    }
}
