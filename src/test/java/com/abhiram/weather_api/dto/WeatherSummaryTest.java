package com.abhiram.weather_api.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherSummaryTest {
    @Test
    void testWeatherSummary() {

        WeatherSummary summary = new WeatherSummary();

        summary.setCity("Hyderabad");
        summary.setTemperature(30.5);

        assertEquals("Hyderabad", summary.getCity());
        assertEquals(30.5, summary.getTemperature());

    }
}
