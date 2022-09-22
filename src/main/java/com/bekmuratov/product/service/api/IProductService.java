package com.bekmuratov.product.service.api;

import com.bekmuratov.product.domain.dto.ProductDto;

public interface IProductService {
    ProductDto findReviewById(Long id);
}
