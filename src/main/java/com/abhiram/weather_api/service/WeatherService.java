package com.abhiram.weather_api.service;

import com.abhiram.weather_api.dto.Day;
import com.abhiram.weather_api.dto.WeatherResponse;
import com.abhiram.weather_api.dto.WeatherSummary;
import com.abhiram.weather_api.exception.CityNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    private static final Logger logger =
            LoggerFactory.getLogger(WeatherService.class);

    private final WebClient webClient;

    @Value("${weather.api.key}")
    private String apiKey;

    public WeatherService(WebClient webClient) {
        this.webClient = webClient;
    }

    public WeatherSummary getWeather(String city) {

        logger.info("Fetching weather for {}", city);

        try {

            WeatherResponse response = webClient.get()
                    .uri(uriBuilder ->
                            uriBuilder
                                    .path("/VisualCrossingWebServices/rest/services/timeline/{city}")
                                    .queryParam("unitGroup", "metric")
                                    .queryParam("key", apiKey)
                                    .queryParam("contentType", "json")
                                    .build(city))
                    .retrieve()
                    .bodyToMono(WeatherResponse.class)
                    .block();

            logger.info("Weather data received for {}", city);

            if (response == null || response.getDays() == null || response.getDays().isEmpty()) {
                throw new CityNotFoundException("City not found");
            }

            Day today = response.getDays().get(0);

            WeatherSummary summary = new WeatherSummary();
            summary.setCity(response.getResolvedAddress());
            summary.setTemperature(today.getTemp());
            summary.setHumidity(today.getHumidity());
            summary.setConditions(today.getConditions());

            logger.info("Weather summary created for {}", city);

            return summary;

        } catch (Exception e) {

            logger.error("Failed to fetch weather for {}", city, e);
            throw e;
        }
    }
}