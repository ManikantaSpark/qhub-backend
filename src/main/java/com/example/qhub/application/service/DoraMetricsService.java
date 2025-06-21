package com.example.qhub.application.service;

import com.example.qhub.domain.model.DeploymentData;
import com.example.qhub.domain.model.LeadTimeData;
import com.example.qhub.domain.model.FailureRateData;
import com.example.qhub.domain.model.MttrData;
import com.example.qhub.domain.model.DoraMetricsWeekData;
import com.example.qhub.adapters.outbound.cosmos.CosmosDoraMetricsRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoraMetricsService {
    private final CosmosDoraMetricsRepository cosmosRepo;

    public DoraMetricsService(CosmosDoraMetricsRepository cosmosRepo) {
        this.cosmosRepo = cosmosRepo;
    }

    public List<DeploymentData> getDeploymentData() {
        return cosmosRepo.getAllWeeklyDoraMetrics().stream()
            .map(d -> new DeploymentData(d.getWeek(), d.getDeployment_count(), d.getDeployment_count())) // using deployment_count for both fields
            .collect(Collectors.toList());
    }
    public List<LeadTimeData> getLeadTimeData() {
        return cosmosRepo.getAllWeeklyDoraMetrics().stream()
            .map(d -> new LeadTimeData(d.getWeek() + " P50", d.getLead_time_p50()))
            .collect(Collectors.toList());
    }
    public List<FailureRateData> getFailureRateData() {
        return cosmosRepo.getAllWeeklyDoraMetrics().stream()
            .map(d -> new FailureRateData(d.getWeek(), d.getFailure_rate()))
            .collect(Collectors.toList());
    }
    public List<MttrData> getMttrData() {
        // If you have MTTR in your document, map it here. Otherwise, return empty or static.
        return List.of();
    }
}
