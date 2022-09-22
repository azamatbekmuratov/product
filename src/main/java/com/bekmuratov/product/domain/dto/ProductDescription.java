package com.bekmuratov.product.domain.dto;

import java.util.List;

public class ProductDescription {
    private String title;
    private String text;
    private String subtitle;
    private List<String> usps;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<String> getUsps() {
        return usps;
    }

    public void setUsps(List<String> usps) {
        this.usps = usps;
    }
}
