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
}
