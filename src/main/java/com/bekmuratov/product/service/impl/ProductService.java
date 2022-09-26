package com.bekmuratov.product.service.impl;

import com.bekmuratov.product.domain.dto.ProductDto;
import com.bekmuratov.product.domain.dto.review.ProductReviewDto;
import com.bekmuratov.product.service.api.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService implements IProductService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public ProductDto findProduct(String productId) {

        ResponseEntity<ProductDto> productResponse = fetchProductData(productId);

        final String baseUrl = "http://localhost:8000/api/reviews/v1/review/product/"+productId;
        ResponseEntity<ProductReviewDto> result = restTemplate.getForEntity(baseUrl, ProductReviewDto.class);
        return null;

    }

    private ResponseEntity<ProductDto> fetchProductData(String productId){
        final String url = "https://www.adidas.co.uk/api/products/" + productId;

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "Product Service");
        headers.set("Host", "www.adidas.co.uk");
        headers.add("Accept", "*/*");
        headers.add("Accept-Encoding", "gzip, deflate, br");

        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        return restTemplate.exchange(url, HttpMethod.GET, requestEntity, ProductDto.class);
    }
}
