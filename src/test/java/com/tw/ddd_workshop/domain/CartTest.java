package com.tw.ddd_workshop.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    @Test
    void shouldAddItemsToTheCart() {
        Item applePencil = new Item(new Product("ApplePencil"),2);
        Cart cart = new Cart();

        assertTrue( cart.add(applePencil));
    }
}