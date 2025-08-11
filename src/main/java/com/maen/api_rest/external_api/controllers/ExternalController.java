package com.maen.api_rest.External_api.controllers;

import com.maen.api_rest.External_api.services.ExternalApiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/external")
public class ExternalController {

    private final ExternalApiService externalApiService;

    public ExternalController(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }

    @GetMapping("/data")
    public ResponseEntity<Object> getExternalData() {
        Object data = externalApiService.getExternalData();
        return ResponseEntity.ok(data);
    }
}
