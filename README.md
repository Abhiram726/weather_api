<div align="center">

# 🌤 Weather API

### A Full-Stack Weather Application built with Spring Boot

Real-time weather information powered by the **Visual Crossing Weather API**, featuring a responsive frontend, clean layered architecture, exception handling, logging, unit testing, and live deployment.

<br>

[![Live Demo](https://img.shields.io/badge/Live-Demo-success?style=for-the-badge)](https://weather-api-auxp.onrender.com)
[![Java](https://img.shields.io/badge/Java-21-E76F00?style=for-the-badge&logo=openjdk&logoColor=white)]
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)]
[![Maven](https://img.shields.io/badge/Maven-3.9-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)]
[![License](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)]

</div>

---

# 🌐 Live Demo

### Application

https://weather-api-auxp.onrender.com

### API

```http
GET https://weather-api-auxp.onrender.com/weather/Hyderabad
```

---

# 📸 Preview

<img width="563" height="663" alt="image" src="https://github.com/user-attachments/assets/294b96bd-37ad-493e-bdbe-b99cf71519fd" />


```
Weather App

Enter City
─────────────────────

[ Hyderabad       ]

[ Get Weather ]

Temperature : 31°C

Humidity    : 42%

Conditions  : Cloudy
```

---

# ✨ Features

- Live weather retrieval
- Responsive frontend
- Dark / Light mode
- RESTful API
- WebClient integration
- DTO-based response mapping
- Layered architecture
- Global exception handling
- Structured logging using SLF4J
- Unit testing with JUnit & Mockito
- Secure API key using environment variables
- Dockerized deployment
- Live cloud deployment on Render

---

# 🏗 Architecture

```text
                 Browser
                     │
                     ▼
              HTML / CSS / JS
                     │
             GET /weather/{city}
                     │
                     ▼
          WeatherController
                     │
                     ▼
            WeatherService
                     │
                     ▼
               Spring WebClient
                     │
                     ▼
      Visual Crossing Weather API
                     │
                     ▼
             WeatherResponse DTO
                     │
                     ▼
             WeatherSummary DTO
                     │
                     ▼
                 JSON Response
```

---

# 🛠 Tech Stack

| Category | Technology |
|-----------|------------|
| Language | Java 21 |
| Framework | Spring Boot |
| Frontend | HTML, CSS, JavaScript |
| HTTP Client | WebClient |
| Build Tool | Maven |
| Testing | JUnit 5, Mockito |
| Logging | SLF4J |
| API | Visual Crossing Weather API |
| Deployment | Docker + Render |
| Version Control | Git & GitHub |

---

# 📁 Project Structure

```text
src
├── config
│   └── WebClientConfig
│
├── controller
│   └── WeatherController
│
├── dto
│   ├── Day
│   ├── WeatherResponse
│   └── WeatherSummary
│
├── exception
│   ├── CityNotFoundException
│   └── GlobalExceptionHandler
│
├── service
│   └── WeatherService
│
└── WeatherApiApplication
```

---

# 🚀 Running Locally

### Clone

```bash
git clone https://github.com/Abhiram726/weather_api.git
cd weather_api
```

---

### Configure API Key

Create or edit

```text
src/main/resources/application.properties
```

```properties
weather.api.key=YOUR_VISUAL_CROSSING_API_KEY
```

---

### Build

```bash
mvn clean install
```

---

### Run

```bash
mvn spring-boot:run
```

or

```bash
java -jar target/weather_api-0.0.1-SNAPSHOT.jar
```

---

### Open

Frontend

```text
http://localhost:8080
```

API

```http
GET http://localhost:8080/weather/Hyderabad
```

---

# 📡 API

## Get Weather

```http
GET /weather/{city}
```

Example

```http
GET /weather/London
```

Response

```json
{
  "city": "London",
  "temperature": 22.7,
  "humidity": 65,
  "conditions": "Partially Cloudy"
}
```

---

# 📚 What I Learned

- Spring Boot Fundamentals
- Dependency Injection
- Bean Configuration
- REST API Development
- WebClient
- DTO Mapping
- Exception Handling
- Logging
- Unit Testing
- Docker
- Cloud Deployment
- Git & GitHub Workflow

---

# 🚀 Future Improvements

- 7-Day Forecast
- Hourly Forecast
- Weather Icons
- Current Location Support
- Search History
- Favourite Cities
- Air Quality Index
- Interactive Weather Maps
- Progressive Web App (PWA)

---

<div align="center">

### ⭐ If you found this project interesting, consider giving it a star.

Made with Spring Boot ☕ and lots of curiosity.

</div>
