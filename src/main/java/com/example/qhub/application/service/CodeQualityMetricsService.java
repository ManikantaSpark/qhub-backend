package com.example.qhub.application.service;

import com.example.qhub.domain.model.CodeQualityMetric;
import com.example.qhub.domain.model.CodeQualityBarChartItem;
import com.example.qhub.domain.model.CodeQualityPieChartItem;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CodeQualityMetricsService {
    public List<CodeQualityMetric> getMainMetrics() {
        return Arrays.asList(
            new CodeQualityMetric("Bugs", 12, "SonarQube", "🔴"),
            new CodeQualityMetric("Vulnerabilities", 4, "SonarQube", "🔴"),
            new CodeQualityMetric("Code Coverage (%)", 72, "SonarQube", "🟡"),
            new CodeQualityMetric("Technical Debt (hrs)", 18, "SonarQube", "🟡"),
            new CodeQualityMetric("Maintainability", "B", "SonarQube", "🟡"),
            new CodeQualityMetric("Duplicated Lines", 8.2, "SonarQube", "🔴")
        );
    }

    public List<CodeQualityBarChartItem> getBarChartData() {
        return Arrays.asList(
            new CodeQualityBarChartItem("Bugs", 12, "Bugs"),
            new CodeQualityBarChartItem("Vulnerabilities", 4, "Vulnerabilities"),
            new CodeQualityBarChartItem("Technical Debt (hrs)", 18, "Technical Debt"),
            new CodeQualityBarChartItem("Duplicated Lines (%)", 8.2, "Duplicated Lines")
        );
    }

    public List<CodeQualityPieChartItem> getPieChartData() {
        return Arrays.asList(
            new CodeQualityPieChartItem("Coverage", 72),
            new CodeQualityPieChartItem("Uncovered", 28)
        );
    }
}
