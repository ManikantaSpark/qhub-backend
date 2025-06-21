package com.example.qhub.application.service;

import com.example.qhub.domain.model.*;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class DashboardService {
    public List<DashboardSummaryMetric> getSummaryMetrics() {
        return Arrays.asList(
            // DORA metrics
            new DashboardSummaryMetric("Deployment Frequency", "8.2", "+12%", "up", "GitBranch", "text-cyan-400", "bg-cyan-500/20", "border-cyan-500/30", "dora"),
            new DashboardSummaryMetric("Lead Time", "4.2h", "-8%", "down", "Clock", "text-purple-400", "bg-purple-500/20", "border-purple-500/30", "dora"),
            new DashboardSummaryMetric("Change Failure Rate", "2.5%", "-1.2%", "down", "AlertTriangle", "text-red-400", "bg-red-500/20", "border-red-500/30", "dora"),
            new DashboardSummaryMetric("MTTR", "45m", "-15m", "down", "Activity", "text-orange-400", "bg-orange-500/20", "border-orange-500/30", "dora"),
            // Performance metrics
            new DashboardSummaryMetric("Average CPU Usage", "68%", "+5%", "up", "Cpu", "text-blue-400", "bg-blue-500/20", "border-blue-500/30", "performance"),
            new DashboardSummaryMetric("Memory Utilization", "74%", "+2%", "up", "Memory", "text-green-400", "bg-green-500/20", "border-green-500/30", "performance"),
            new DashboardSummaryMetric("Response Time", "125ms", "-15ms", "down", "Clock", "text-purple-400", "bg-purple-500/20", "border-purple-500/30", "performance"),
            new DashboardSummaryMetric("System Uptime", "99.94%", "+0.02%", "up", "TrendingUp", "text-cyan-400", "bg-cyan-500/20", "border-cyan-500/30", "performance"),
            // Agile metrics (top)
            new DashboardSummaryMetric("Sprint Velocity", "54 pts", "+6 pts", "up", "TrendingUp", "text-orange-400", "bg-orange-500/20", "border-orange-500/30", "agile"),
            new DashboardSummaryMetric("Cycle Time", "3.1 days", "-0.5 days", "down", "TrendingDown", "text-yellow-400", "bg-yellow-500/20", "border-yellow-500/30", "agile"),
            new DashboardSummaryMetric("Test Coverage", "78%", "+3%", "up", "TrendingUp", "text-green-600", "bg-green-600/20", "border-green-600/30", "agile"),
            new DashboardSummaryMetric("Team Velocity", "19/week", "+3", "up", "TrendingUp", "text-blue-600", "bg-blue-600/20", "border-blue-600/30", "agile"),
            // Agile Pull Request Metrics (bottom cards)
            new DashboardSummaryMetric("Avg Review Time", "4.2 hours", "-1.2h", "down", "Clock", "text-purple-400", "bg-purple-500/20", "border-purple-500/30", "agile"),
            new DashboardSummaryMetric("PR Size (Lines)", "185", "-45", "down", "FileText", "text-blue-400", "bg-blue-500/20", "border-blue-500/30", "agile"),
            new DashboardSummaryMetric("Approval Rate", "94.2%", "+2.1%", "up", "CheckCircle", "text-green-400", "bg-green-500/20", "border-green-500/30", "agile"),
            new DashboardSummaryMetric("Merge Time", "6.8 hours", "-2.1h", "down", "GitMerge", "text-orange-400", "bg-orange-500/20", "border-orange-500/30", "agile")
        );
    }
    public List<DashboardMenuItem> getMenuItems() {
        return Arrays.asList(
            new DashboardMenuItem("dora", "DORA Metrics", "GitBranch", "DevOps performance indicators"),
            new DashboardMenuItem("performance", "Performance", "Gauge", "System & app metrics"),
            new DashboardMenuItem("agile", "Agile Metrics", "Users", "Team productivity"),
            new DashboardMenuItem("testing", "Test Automation", "TestTube", "Quality assurance")
        );
    }
    public List<DashboardSummaryCard> getSummaryCards() {
        return Arrays.asList(
            // Performance cards
            new DashboardSummaryCard("68%", "Average CPU Usage", "+5%", "TrendingUp", "bg-blue-500", "Performance"),
            new DashboardSummaryCard("74%", "Memory Utilization", "+2%", "TrendingUp", "bg-green-500", "Performance"),
            new DashboardSummaryCard("125ms", "Response Time", "-15ms", "TrendingDown", "bg-purple-500", "Performance"),
            new DashboardSummaryCard("99.94%", "System Uptime", "+0.02%", "TrendingUp", "bg-cyan-500", "Performance"),
            // Agile metrics cards
            new DashboardSummaryCard("54 pts", "Sprint Velocity", "+6 pts", "TrendingUp", "bg-orange-500", "Agile"),
            new DashboardSummaryCard("3.1 days", "Cycle Time", "-0.5 days", "TrendingDown", "bg-yellow-500", "Agile"),
            new DashboardSummaryCard("78%", "Test Coverage", "+3%", "TrendingUp", "bg-green-600", "Agile"),
            new DashboardSummaryCard("19/week", "Team Velocity", "+3", "TrendingUp", "bg-blue-600", "Agile"),
            // Test Automation cards
            new DashboardSummaryCard("82.4%", "Test Coverage", "+3.2%", "TrendingUp", "bg-green-700", "Test Automation"),
            new DashboardSummaryCard("98.1%", "Test Success Rate", "+0.8%", "TrendingUp", "bg-blue-700", "Test Automation"),
            new DashboardSummaryCard("12.3 min", "Avg Execution Time", "-2.1 min", "TrendingDown", "bg-purple-700", "Test Automation"),
            new DashboardSummaryCard("0.3%", "Flaky Test Rate", "-0.1%", "TrendingDown", "bg-red-700", "Test Automation"),
            new DashboardSummaryCard("340%", "Test Automation ROI", "+28%", "TrendingUp", "bg-cyan-700", "Test Automation"),
            new DashboardSummaryCard("76%", "Parallel Efficiency", "+5%", "TrendingUp", "bg-orange-700", "Test Automation"),
            new DashboardSummaryCard("94.7%", "Test Stability", "+1.9%", "TrendingUp", "bg-yellow-700", "Test Automation"),
            new DashboardSummaryCard("99.2%", "Environment Uptime", "+0.1%", "TrendingUp", "bg-blue-800", "Test Automation")
        );
    }
    public List<DashboardTimeRange> getTimeRanges() {
        return Arrays.asList(
            new DashboardTimeRange("7d", "Last 7 days"),
            new DashboardTimeRange("30d", "Last 30 days"),
            new DashboardTimeRange("90d", "Last 90 days"),
            new DashboardTimeRange("6m", "Last 6 months"),
            new DashboardTimeRange("1y", "Last year"),
            new DashboardTimeRange("custom", "Custom range")
        );
    }
    public List<DashboardTeam> getTeams() {
        return Arrays.asList(
            new DashboardTeam("all", "All Teams"),
            new DashboardTeam("frontend", "Frontend Team"),
            new DashboardTeam("backend", "Backend Team"),
            new DashboardTeam("devops", "DevOps Team"),
            new DashboardTeam("qa", "QA Team"),
            new DashboardTeam("mobile", "Mobile Team")
        );
    }
}
