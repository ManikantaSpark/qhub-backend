# Spring Boot Multi-Main-Class Project

This project contains multiple main classes:
- com.example.hexagonal.HexagonalDemoApplication
- com.example.qhub.QHubApplication

To run a specific main class, use the following command:

```
./mvnw spring-boot:run -Dspring-boot.run.main-class=com.example.hexagonal.HexagonalDemoApplication
```

or

```
./mvnw spring-boot:run -Dspring-boot.run.main-class=com.example.qhub.QHubApplication
```

Replace the main class as needed for your use case.
