package com.example.demo.item;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    public List<Item> getItems()
    {
        return List.of(new Item(1, "a"), new Item(2, "b"));
    }
}
