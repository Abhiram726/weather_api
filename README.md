<div align="center">

# 🌤 Weather API

*Real-time weather. Clean architecture. Zero fluff.*

A Spring Boot REST API that fetches live weather data from the **Visual Crossing Weather API** using **WebClient**, following a layered architecture and production-inspired backend practices.

---

![Java](https://img.shields.io/badge/Java-25-E76F00?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.x-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![Status](https://img.shields.io/badge/Status-Pending-success?style=flat-square)

</div>

---

## Architecture

```text
                Client
                   │
                   ▼
        WeatherController
                   │
                   ▼
          WeatherService
                   │
        ┌──────────┴──────────┐
        │                     │
        ▼                     ▼
    WebClient            Exception Handler
        │
        ▼
 Visual Crossing API
```

---

## Tech Stack

```yaml
Language      : Java 25
Framework     : Spring Boot
Architecture  : Layered Architecture
Build Tool    : Maven
HTTP Client   : WebClient
Logging       : SLF4J
Testing       : JUnit 5 + Mockito
API           : Visual Crossing Weather API
```

---

## Example Request

```http
GET /weather/Hyderabad
```

Response

```json
{
  "city": "Hyderabad",
  "temperature": 30.4,
  "humidity": 41.8,
  "conditions": "Partially Cloudy"
}
```

---

## Features

- Live weather retrieval
- External REST API integration
- Layered architecture
- DTO-based response mapping
- Centralized exception handling
- Structured logging
- Unit testing
- Secure API key configuration

---

## Project Structure

```text
src
├── config
├── controller
├── dto
├── exception
├── service
└── WeatherApiApplication
```

---

## Run

```bash
git clone https://github.com/Abhiram726/weather_api.git

cd weather-api

mvn spring-boot:run
```

---

## Why I Built This

This project was built to strengthen backend development fundamentals by implementing a real-world REST API from scratch. It focuses on writing clean, maintainable Spring Boot code rather than simply consuming an external API.

Concepts explored:

- Dependency Injection
- Bean Configuration
- REST API Design
- WebClient
- DTO Mapping
- Logging
- Exception Handling
- Unit Testing
- Maven

---

<div align="center">

### Backend is more than making APIs work.

### It's about making them maintainable.

</div>
