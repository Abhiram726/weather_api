````markdown
# 🌦️ Weather API

A clean Spring Boot REST API that fetches real-time weather information using the Visual Crossing Weather API. Built to practice backend fundamentals including REST APIs, dependency injection, WebClient, exception handling, logging, and unit testing.

---

## ✨ Features

- 🌍 Get current weather by city
- ⚡ Fast REST API using Spring Boot
- 🔗 External API integration with WebClient
- 📝 Structured logging
- 🚨 Global exception handling
- 🧪 Unit testing with JUnit & Mockito
- 📦 Clean layered architecture
- 🔐 API key stored securely using properties

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 25 | Programming Language |
| Spring Boot | Backend Framework |
| Spring MVC | REST API |
| WebClient | HTTP Client |
| Maven | Dependency Management |
| Lombok | Boilerplate Reduction |
| JUnit 5 | Unit Testing |
| Mockito | Mocking |
| SLF4J + Logback | Logging |
| Visual Crossing API | Weather Data |

---

## 📂 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.abhiram.weather_api
│   │       ├── config
│   │       ├── controller
│   │       ├── dto
│   │       ├── exception
│   │       ├── service
│   │       └── WeatherApiApplication.java
│   │
│   └── resources
│       └── application.properties
│
└── test
```

---

## 🚀 API Endpoint

### Get Weather

```http
GET /weather/{city}
```

Example

```http
GET /weather/Hyderabad
```

### Response

```json
{
  "city": "Hyderabad",
  "temperature": 29.8,
  "humidity": 41.4,
  "conditions": "Partially cloudy"
}
```

---

## ⚙️ Setup

### Clone Repository

```bash
git clone https://github.com/your-username/weather_api.git
```

### Navigate

```bash
cd weather_api
```

### Configure API Key

`application.properties`

```properties
weather.api.key=YOUR_VISUAL_CROSSING_API_KEY
```

### Run

```bash
mvn spring-boot:run
```

---

## 🧪 Testing

Run all tests

```bash
mvn test
```

---

## 📸 Sample Output

```json
{
  "city": "Hyderabad",
  "temperature": 30.2,
  "humidity": 62.1,
  "conditions": "Clear"
}
```

---

## 📚 Concepts Practiced

- REST API Development
- Dependency Injection
- Spring Bean Configuration
- WebClient
- DTO Mapping
- JSON Serialization
- Exception Handling
- Logging
- Unit Testing
- Maven Project Structure

---

## 🔮 Future Improvements

- Weather Forecast (7-Day)
- Current Air Quality
- Redis Caching
- Docker Support
- Swagger / OpenAPI Documentation
- GitHub Actions CI/CD
- API Rate Limiting
- Response Caching
- Database Integration
- Reactive WebFlux Version

---

## 👨‍💻 Author

**Abhiram**

Electrical & Electronics Engineering Student | Aspiring Backend Developer

---

## ⭐ If you found this project useful, consider giving it a star.
````
