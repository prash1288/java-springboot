package com.bootexample4.products.controller;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ProductController_createProduct_36b748883e_Test {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateProduct() {
        Product product = new Product();
        product.setId(1L); // Changed from int to Long
        product.setName("TestProduct");
        product.setDescription("TestDescription");
        product.setPrice(100.0);

        when(productRepository.save(any(Product.class))).thenReturn(product);

        Product createdProduct = productController.createProduct(product);

        assertEquals(product.getId(), createdProduct.getId());
        assertEquals(product.getName(), createdProduct.getName());
        assertEquals(product.getDescription(), createdProduct.getDescription());
        assertEquals(product.getPrice(), createdProduct.getPrice(), 0.01);

        verify(productRepository, times(1)).save(product);
    }

    @Test
    public void testCreateProduct_NullProduct() {
        Product product = null;

        when(productRepository.save(any(Product.class))).thenReturn(null);

        Product createdProduct = productController.createProduct(product);

        assertEquals(null, createdProduct);

        verify(productRepository, times(1)).save(product);
    }
}
