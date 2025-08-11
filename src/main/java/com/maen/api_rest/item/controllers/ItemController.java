package com.maen.api_rest.item.controllers;

import com.maen.api_rest.item.model.entities.ItemEntity;
import com.maen.api_rest.item.model.dto.ItemEntityDTO;
import com.maen.api_rest.item.model.mappers.ItemEntityMapper;
import com.maen.api_rest.item.services.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<ItemEntityDTO>> getAllItems() {
        List<ItemEntity> entities = service.getAllItems();
        List<ItemEntityDTO> dto = entities.stream()
                .map(ItemEntityMapper::toDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/search")
    public List<ItemEntity> getItemByName(String name) {
        return service.getItemName(name);
    }
}