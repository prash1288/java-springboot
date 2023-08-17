package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Product_getId_ba349b1eff_Test {

    @InjectMocks
    private Product product;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        product.setId(123L);
    }

    @Test
    public void testGetIdSuccess() {
        Long expectedId = 123L;
        Long actualId = product.getId();
        assertEquals(expectedId, actualId, "Expected id does not match actual id");
    }

    @Test
    public void testGetIdFailure() {
        Long unexpectedId = 456L;
        Long actualId = product.getId();
        assertNotEquals(unexpectedId, actualId, "Unexpected id matches actual id");
    }
}
