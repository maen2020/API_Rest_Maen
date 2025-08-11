package com.maen.api_rest.External_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApiExternalConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}