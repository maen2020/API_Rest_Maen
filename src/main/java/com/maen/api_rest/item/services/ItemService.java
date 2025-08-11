package com.maen.api_rest.item.services;

import com.maen.api_rest.item.model.entities.ItemEntity;
import com.maen.api_rest.item.respositories.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<ItemEntity> getAllItems() {
        return (List<ItemEntity>) repository.findAll();
    }

    public List<ItemEntity> getItemName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}