package com.bekmuratov.product.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Detail {
    private String type;
    private String source;

    @JsonProperty("image_url")
    private String imageUrl;

    private DetailMetaData metadata;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public DetailMetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(DetailMetaData metadata) {
        this.metadata = metadata;
    }
}
