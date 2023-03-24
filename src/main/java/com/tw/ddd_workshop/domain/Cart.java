package com.tw.ddd_workshop.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public Cart(){
        this.items = new ArrayList<>();
    }

    private List<Item> items;
    public boolean add(Item item){
        return this.items.add(item);
    }

    public boolean remove(Item item){
        return this.items.remove(item);
    }

    public List<Item> getItems(){
        return this.items;
    }

}
