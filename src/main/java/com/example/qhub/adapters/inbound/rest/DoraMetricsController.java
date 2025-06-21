package com.example.qhub.adapters.inbound.rest;

import com.example.qhub.application.service.DoraMetricsService;
import com.example.qhub.domain.model.DeploymentData;
import com.example.qhub.domain.model.FailureRateData;
import com.example.qhub.domain.model.LeadTimeData;
import com.example.qhub.domain.model.MttrData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dora-metrics")
public class DoraMetricsController {
    private final DoraMetricsService doraMetricsService;

    public DoraMetricsController(DoraMetricsService doraMetricsService) {
        this.doraMetricsService = doraMetricsService;
    }

    @GetMapping("/deployment-frequency")
    public List<DeploymentData> getDeploymentData() {
        return doraMetricsService.getDeploymentData();
    }

    @GetMapping("/lead-time")
    public List<LeadTimeData> getLeadTimeData() {
        return doraMetricsService.getLeadTimeData();
    }

    @GetMapping("/failure-rate")
    public List<FailureRateData> getFailureRateData() {
        return doraMetricsService.getFailureRateData();
    }

    @GetMapping("/mttr")
    public List<MttrData> getMttrData() {
        return doraMetricsService.getMttrData();
    }
}
