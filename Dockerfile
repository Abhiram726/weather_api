# Use Java 21
FROM eclipse-temurin:21-jdk

# Create working directory
WORKDIR /app

# Copy project files
COPY . .

# Build the application
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Expose Spring Boot port
EXPOSE 8080

# Start the application
CMD ["java", "-jar", "target/weather_api-0.0.1-SNAPSHOT.jar"]