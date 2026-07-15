---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Abhiram726/weather_api.git
cd weather_api
```

### 2. Configure the API Key

Create or update `src/main/resources/application.properties`:

```properties
weather.api.key=YOUR_VISUAL_CROSSING_API_KEY
```

Get your free API key from:
https://www.visualcrossing.com/weather-api

### 3. Build the Project

```bash
mvn clean install
```

### 4. Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the generated JAR:

```bash
java -jar target/weather_api-0.0.1-SNAPSHOT.jar
```

### 5. Open the Application

Frontend

```text
http://localhost:8080/
```

REST API

```http
GET http://localhost:8080/weather/Hyderabad
```

Example Response

```json
{
  "city": "Hyderabad",
  "temperature": 30.4,
  "humidity": 41.8,
  "conditions": "Partially Cloudy"
}
```

---

## 📌 API Endpoint

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/weather/{city}` | Returns the current weather details for the specified city |

Example

```http
GET /weather/London
GET /weather/Hyderabad
GET /weather/New York
```