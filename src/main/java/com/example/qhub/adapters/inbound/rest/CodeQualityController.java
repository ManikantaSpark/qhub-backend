package com.example.qhub.adapters.inbound.rest;

import com.example.qhub.application.service.CodeQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/code-quality-metrics")
public class CodeQualityController {
    private final CodeQualityService codeQualityService;

    @Autowired
    public CodeQualityController(CodeQualityService codeQualityService) {
        this.codeQualityService = codeQualityService;
    }

    @GetMapping
    public Map<String, Object> getCodeQualityMetrics() {
        return codeQualityService.getAllCodeQualityData();
    }
}
