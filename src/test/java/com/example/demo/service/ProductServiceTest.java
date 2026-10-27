package com.example.demo.service;

import com.example.demo.domain.Product;
import com.example.demo.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;

    @Test
    void createProduct_ShouldSaveProduct_WhenBusinessRulesPass() {
        Product inputProduct = new Product("Gaming Mouse", 49.99);
        Product savedProduct = new Product("Gaming Mouse", 49.99);
        savedProduct.setId(10L);
        Mockito.when(productRepository.save(any(Product.class))).thenReturn(savedProduct);

        Product result = productService.createProduct(inputProduct);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(10L, result.getId());
    }
}