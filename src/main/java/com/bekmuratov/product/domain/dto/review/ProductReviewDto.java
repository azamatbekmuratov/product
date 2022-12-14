package com.bekmuratov.product.domain.dto.review;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class ProductReviewDto implements Serializable {
    private Long id;
    @NotNull
    private String productId;
    private Integer averageReviewScore;
    private Integer numberOfReviews;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getAverageReviewScore() {
        return averageReviewScore;
    }

    public void setAverageReviewScore(Integer averageReviewScore) {
        this.averageReviewScore = averageReviewScore;
    }

    public Integer getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(Integer numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    @Override
    public String toString() {
        return "ProductReviewDto{" +
                "id=" + id +
                ", productId='" + productId + '\'' +
                ", averageReviewScore=" + averageReviewScore +
                ", numberOfReviews=" + numberOfReviews +
                '}';
    }
}
