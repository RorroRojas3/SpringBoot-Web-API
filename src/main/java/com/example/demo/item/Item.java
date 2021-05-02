package com.example.demo.item;

public class Item {

    public Integer id;

    public String Value;

    public Item() {
    }

    public Item(Integer id, String value) {
        this.id = id;
        Value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }
}
