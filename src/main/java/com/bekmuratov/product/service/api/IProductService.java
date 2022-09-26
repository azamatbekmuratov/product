package com.bekmuratov.product.service.api;

import com.bekmuratov.product.domain.dto.ProductDto;

import java.net.URISyntaxException;

public interface IProductService {
    ProductDto findProduct(String productId);
}
