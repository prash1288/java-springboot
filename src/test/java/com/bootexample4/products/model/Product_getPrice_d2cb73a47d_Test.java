// Test generated by RoostGPT for test AmiCorp using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Product_getPrice_d2cb73a47d_Test {

    private Product product;

    @BeforeEach
    public void setup() {
        product = new Product();
    }

    @Test
    public void testGetPrice_WhenPriceIsSet() {
        double expectedPrice = 100.0;
        product.setPrice(expectedPrice);

        double actualPrice = product.getPrice();

        assertEquals(expectedPrice, actualPrice, "The price returned by getPrice() does not match the expected price");
    }

    @Test
    public void testGetPrice_WhenPriceIsNotSet() {
        double defaultPrice = 0.0;

        double actualPrice = product.getPrice();

        assertEquals(defaultPrice, actualPrice, "The price returned by getPrice() does not match the default price when price is not set");
    }
}