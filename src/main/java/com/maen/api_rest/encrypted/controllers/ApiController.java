package com.maen.api_rest.encrypted.controllers;

import com.maen.api_rest.encrypted.services.AESService;
import com.maen.api_rest.encrypted.services.ResponseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v0")
public class ApiController {

    private final AESService aesService;
    public ApiController(AESService aesService) {
        this.aesService = aesService;
    }

    @GetMapping("/encrypt")
    public ResponseService getResponseService(String text) {
        String response = aesService.encrypted(text);
        return new ResponseService(response);
    }
}