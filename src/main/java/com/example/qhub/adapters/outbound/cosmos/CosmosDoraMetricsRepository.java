package com.example.qhub.adapters.outbound.cosmos;

import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.CosmosContainer;
import com.azure.cosmos.CosmosDatabase;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.example.qhub.domain.model.DoraMetricsWeekData;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CosmosDoraMetricsRepository {
    private final CosmosContainer container;

    public CosmosDoraMetricsRepository() {
        CosmosClient client = new CosmosClientBuilder()
            .endpoint("https://qhub-ci-monitor.documents.azure.com:443/")
        // placeholder for secret
            .consistencyLevel(com.azure.cosmos.ConsistencyLevel.EVENTUAL)
            .buildClient();
        CosmosDatabase database = client.getDatabase("qhub_ci");
        this.container = database.getContainer("dora");
    }

    public List<DoraMetricsWeekData> getAllWeeklyDoraMetrics() {
        String query = "SELECT * FROM c";
        List<DoraMetricsWeekData> data = new ArrayList<>();
        container.queryItems(query, new CosmosQueryRequestOptions(), DoraMetricsWeekData.class)
            .forEach(data::add);
        return data;
    }
}
