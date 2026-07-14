package com.abhiram.weather_api.service;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.reactive.function.client.WebClient;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class WeatherServiceTest {

    @Mock
    private WebClient webClient;

    @InjectMocks
    private WeatherService weatherService;

    @Test
    void testServiceCreated() {

        assertNotNull(weatherService);

    }
}
