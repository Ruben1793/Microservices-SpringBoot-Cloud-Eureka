package com.formaciondbi.springboot.app.items.models;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();

    public Item findById(Long id, Integer cantidad);
}
