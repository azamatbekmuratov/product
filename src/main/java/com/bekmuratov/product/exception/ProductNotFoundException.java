package com.bekmuratov.product.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long productId) {
        super(String.format("Product with Id %s not found", productId));
    }
}
