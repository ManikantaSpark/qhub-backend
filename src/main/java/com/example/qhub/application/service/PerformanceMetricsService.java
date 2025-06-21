package com.example.qhub.application.service;

import com.example.qhub.domain.model.SystemPerformanceData;
import com.example.qhub.domain.model.ResponseTimeData;
import com.example.qhub.domain.model.WebVitalsData;
import com.example.qhub.domain.model.UptimeData;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class PerformanceMetricsService {
    public List<SystemPerformanceData> getSystemPerformanceData() {
        return Arrays.asList(
            new SystemPerformanceData("00:00", 45, 62, 78, 34),
            new SystemPerformanceData("04:00", 38, 58, 72, 28),
            new SystemPerformanceData("08:00", 72, 84, 68, 56),
            new SystemPerformanceData("12:00", 85, 91, 74, 78),
            new SystemPerformanceData("16:00", 68, 76, 69, 45),
            new SystemPerformanceData("20:00", 52, 64, 71, 38)
        );
    }
    public List<ResponseTimeData> getResponseTimeData() {
        return Arrays.asList(
            new ResponseTimeData("/api/users", 120, 180, 250),
            new ResponseTimeData("/api/orders", 95, 145, 200),
            new ResponseTimeData("/api/products", 85, 125, 175),
            new ResponseTimeData("/api/auth", 65, 95, 140),
            new ResponseTimeData("/api/analytics", 200, 280, 350)
        );
    }
    public List<WebVitalsData> getWebVitalsData() {
        return Arrays.asList(
            new WebVitalsData("LCP", 2.1, 2.5, "good"),
            new WebVitalsData("FID", 85, 100, "good"),
            new WebVitalsData("CLS", 0.08, 0.1, "good"),
            new WebVitalsData("FCP", 1.4, 1.8, "good"),
            new WebVitalsData("TTI", 3.2, 3.8, "good")
        );
    }
    public List<UptimeData> getUptimeData() {
        return Arrays.asList(
            new UptimeData("API Gateway", 99.95),
            new UptimeData("Database", 99.92),
            new UptimeData("CDN", 99.98),
            new UptimeData("Load Balancer", 99.97),
            new UptimeData("Cache", 99.89)
        );
    }
}
