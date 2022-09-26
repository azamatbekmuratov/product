package com.bekmuratov.product.service.api;

import com.bekmuratov.product.domain.dto.ProductDto;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;

public interface IProductService {
    ResponseEntity<ProductDto> findProduct(String productId);
}
