package com.bekmuratov.product.service.impl;

import com.bekmuratov.product.domain.dto.ProductDto;
import com.bekmuratov.product.domain.dto.review.ProductReviewDto;
import com.bekmuratov.product.service.api.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class ProductService implements IProductService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${api.public.product}")
    private String publicProductApiURL;

    @Value("${api.public.host}")
    private String publicProductApiHost;

    @Value("${api.review}")
    private String productReviewApiURL;

    @Override
    @Retryable(value = Exception.class, maxAttempts = 2, backoff = @Backoff(delay = 100))
    public ResponseEntity<ProductDto> findProduct(String productId) {

        ResponseEntity<ProductDto> pResp = fetchProductData(productId);

        ResponseEntity<ProductReviewDto> pReviewResp = fetchProductReviewData(productId);

        if (pReviewResp.getStatusCode() == HttpStatus.OK) {
            Objects.requireNonNull(pResp.getBody()).setProductReview(pReviewResp.getBody());
        }

        return pResp;

    }

    private ResponseEntity<ProductDto> fetchProductData(String productId){
        final String url = publicProductApiURL + productId;

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "Product Service");
        headers.set("Host", publicProductApiHost);
        headers.add("Accept", "*/*");
        headers.add("Accept-Encoding", "gzip, deflate, br");

        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        return restTemplate.exchange(url, HttpMethod.GET, requestEntity, ProductDto.class);
    }

    private ResponseEntity<ProductReviewDto> fetchProductReviewData(String productId){
        final String baseUrl = productReviewApiURL + productId;
        return restTemplate.getForEntity(baseUrl, ProductReviewDto.class);
    }

}
