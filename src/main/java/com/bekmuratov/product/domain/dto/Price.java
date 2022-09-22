package com.bekmuratov.product.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price {
    private Double currenttPrice;

    @JsonProperty("standard_price")
    private Double standardPrice;

    @JsonProperty("standard_price_no_vat")
    private Double standardPriceNoVat;

    @JsonProperty("sale_price")
    private Double salePrice;

    @JsonProperty("sale_price_no_vat")
    private Double salePriceNoVat;

    @JsonProperty("discount_text")
    private String discountText;

    public Double getCurrenttPrice() {
        return currenttPrice;
    }

    public void setCurrenttPrice(Double currenttPrice) {
        this.currenttPrice = currenttPrice;
    }

    public Double getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(Double standardPrice) {
        this.standardPrice = standardPrice;
    }

    public Double getStandardPriceNoVat() {
        return standardPriceNoVat;
    }

    public void setStandardPriceNoVat(Double standardPriceNoVat) {
        this.standardPriceNoVat = standardPriceNoVat;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getSalePriceNoVat() {
        return salePriceNoVat;
    }

    public void setSalePriceNoVat(Double salePriceNoVat) {
        this.salePriceNoVat = salePriceNoVat;
    }

    public String getDiscountText() {
        return discountText;
    }

    public void setDiscountText(String discountText) {
        this.discountText = discountText;
    }
}
