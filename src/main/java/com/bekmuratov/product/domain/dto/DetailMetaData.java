package com.bekmuratov.product.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DetailMetaData {

    @JsonProperty("asset_usage")
    private List<String> assetUsage;

    @JsonProperty("asset_category")
    private String assetCategory;

    private String imageStyle;
    private String view;
    private String usageTerms;
    private String sortOrder;

    public List<String> getAssetUsage() {
        return assetUsage;
    }

    public void setAssetUsage(List<String> assetUsage) {
        this.assetUsage = assetUsage;
    }

    public String getAssetCategory() {
        return assetCategory;
    }

    public void setAssetCategory(String assetCategory) {
        this.assetCategory = assetCategory;
    }

    public String getImageStyle() {
        return imageStyle;
    }

    public void setImageStyle(String imageStyle) {
        this.imageStyle = imageStyle;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getUsageTerms() {
        return usageTerms;
    }

    public void setUsageTerms(String usageTerms) {
        this.usageTerms = usageTerms;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
}
