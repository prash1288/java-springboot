package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_setId_04a8e16b7c_Test {

    @InjectMocks
    private Product product;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetId_withValidId() {
        Long expectedId = 1L;
        product.setId(expectedId);
        assertEquals(expectedId, product.getId(), "The id should be set correctly");
    }
}
