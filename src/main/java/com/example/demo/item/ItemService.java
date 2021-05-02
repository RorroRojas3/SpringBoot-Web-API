package com.example.demo.item;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    public List<Item> getItems()
    {
        return List.of(new Item(1, "a"), new Item(2, "b"));
    }

    public Item postItem(ItemRequest request)
    {
        return new Item(1, request.value);
    }

    public Item putItem(ItemRequest request)
    {
        return new Item(1, request.value);
    }

    public boolean deleteItem(int id)
    {
        return true;
    }
}
