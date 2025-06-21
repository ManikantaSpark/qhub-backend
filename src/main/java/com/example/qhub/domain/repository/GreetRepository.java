package com.example.qhub.domain.repository;

import com.example.qhub.domain.model.Greeting;

public interface GreetRepository {
    Greeting save(Greeting greeting);
    // Add more domain-specific methods as needed
}
