package com.tw.ddd_workshop.application;

import com.tw.ddd_workshop.domain.Cart;
import com.tw.ddd_workshop.domain.Product;
import com.tw.ddd_workshop.domain.Item;

public class Main {
    public static void main(String[] args) {
        Product applePencil = new Product("Apple Pencil");
        Product sonyWirelessHeadphone = new Product("Sony wireless headphones");
        Cart cart = new Cart();
        Item pencil = new Item(applePencil,2);
        Item headPhone = new Item(sonyWirelessHeadphone,1);
        cart.add(pencil);
        cart.add(headPhone);
        System.out.println(cart.getItems());
    }
}