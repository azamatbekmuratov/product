package com.bekmuratov.product.controller;

import com.bekmuratov.product.domain.dto.ProductDto;
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
    private IProductService reviewService;

    @GetMapping("/product/{id}")
    public ResponseEntity<?> findReviewById(@PathVariable Long id){
        ProductDto productDto = reviewService.findReviewById(id);
        return ResponseEntity.ok(productDto);
    }
}
