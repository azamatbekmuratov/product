package com.bekmuratov.product.controller;

import com.bekmuratov.product.service.api.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Azamat Bekmuratov
 */
@RestController
@RequestMapping("/api/products/v1")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/product/{productId}")
    public ResponseEntity<?> findProduct(@PathVariable String productId) {
        return productService.findProduct(productId);
    }
}
