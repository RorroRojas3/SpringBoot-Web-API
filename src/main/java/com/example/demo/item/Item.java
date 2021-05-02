package com.example.demo.item;

public class Item {

    public Integer id;

    public String value;

    public Item() {
    }

    public Item(Integer id, String value) {
        this.id = id;
        value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
