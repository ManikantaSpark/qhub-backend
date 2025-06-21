package com.example.qhub.adapters.inbound.rest;

import com.example.qhub.application.service.DashboardService;
import com.example.qhub.domain.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {
    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/summary-metrics")
    public List<DashboardSummaryMetric> getSummaryMetrics() {
        return dashboardService.getSummaryMetrics();
    }

    @GetMapping("/menu-items")
    public List<DashboardMenuItem> getMenuItems() {
        return dashboardService.getMenuItems();
    }

    @GetMapping("/summary-cards")
    public List<DashboardSummaryCard> getSummaryCards() {
        return dashboardService.getSummaryCards();
    }

    @GetMapping("/time-ranges")
    public List<DashboardTimeRange> getTimeRanges() {
        return dashboardService.getTimeRanges();
    }

    @GetMapping("/teams")
    public List<DashboardTeam> getTeams() {
        return dashboardService.getTeams();
    }
}
