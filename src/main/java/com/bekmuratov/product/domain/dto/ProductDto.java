package com.bekmuratov.product.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ProductDto implements Serializable {
    private Long id;

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("model_number")
    private String modelNumber;

    private String name;

    @JsonProperty("meta_data")
    private MetaData metaData;

    @JsonProperty("view_list")
    private List<Detail> viewList;

    @JsonProperty("dynamic_background_assets")
    private List<Detail> dynamicBackgroundAssets;


    @JsonProperty("confirmed_dynamic_background_assets")
    private List<Detail> confirmedDynamicBackgroundAssets;

    @JsonProperty("attribute_list")
    private List<Attribute> attributes;

    @JsonProperty("pricing_information")
    private Price pricingInformation;

    @JsonProperty("product_description")
    private ProductDescription productDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public List<Detail> getViewList() {
        return viewList;
    }

    public void setViewList(List<Detail> viewList) {
        this.viewList = viewList;
    }

    public List<Detail> getDynamicBackgroundAssets() {
        return dynamicBackgroundAssets;
    }

    public void setDynamicBackgroundAssets(List<Detail> dynamicBackgroundAssets) {
        this.dynamicBackgroundAssets = dynamicBackgroundAssets;
    }

    public List<Detail> getConfirmedDynamicBackgroundAssets() {
        return confirmedDynamicBackgroundAssets;
    }

    public void setConfirmedDynamicBackgroundAssets(List<Detail> confirmedDynamicBackgroundAssets) {
        this.confirmedDynamicBackgroundAssets = confirmedDynamicBackgroundAssets;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Price getPricingInformation() {
        return pricingInformation;
    }

    public void setPricingInformation(Price pricingInformation) {
        this.pricingInformation = pricingInformation;
    }

    public ProductDescription getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }
}
