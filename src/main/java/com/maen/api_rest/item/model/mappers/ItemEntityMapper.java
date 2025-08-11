package com.maen.api_rest.item.model.mappers;

import com.maen.api_rest.item.model.entities.ItemEntity;
import com.maen.api_rest.item.model.dto.ItemEntityDTO;

public class ItemEntityMapper {

    public static ItemEntityDTO toDTO(ItemEntity entity) {
        return new ItemEntityDTO(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getPrice(),
                entity.getSku()
        );
    }

    public static ItemEntity toEntity(ItemEntityDTO dto) {
        return new ItemEntity(
                dto.getId(), // puede ser null si estás creando un nuevo item
                dto.getName(),
                dto.getDescription(),
                dto.getPrice(),
                dto.getSku()
        );
    }
}