package com.bekmuratov.product.service.impl;

import com.bekmuratov.product.domain.dto.ProductDto;
import com.bekmuratov.product.service.api.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    @Override
    public ProductDto findReviewById(Long id) {
        return null;
    }

}
