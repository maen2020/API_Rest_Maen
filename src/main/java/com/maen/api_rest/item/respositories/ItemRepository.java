package com.maen.api_rest.item.respositories;

import com.maen.api_rest.item.model.entities.ItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<ItemEntity, Long> {

    List<ItemEntity> findByNameContainingIgnoreCase(String name);
}