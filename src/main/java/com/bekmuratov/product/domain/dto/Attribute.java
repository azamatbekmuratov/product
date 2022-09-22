package com.bekmuratov.product.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Attribute {
    private Boolean sale;
    private String brand;
    private String color;
    private String gender;
    private Boolean outlet;
    private List<String> sport;
    private List<String> closure;
    private String hashtag;
    private List<String> surface;
    private String category;

    @JsonProperty("size_page")
    private String sizePage;
    private List<String> sportSub;
    private List<String> productfit;

    public Boolean getSale() {
        return sale;
    }

    public void setSale(Boolean sale) {
        this.sale = sale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getOutlet() {
        return outlet;
    }

    public void setOutlet(Boolean outlet) {
        this.outlet = outlet;
    }

    public List<String> getSport() {
        return sport;
    }

    public void setSport(List<String> sport) {
        this.sport = sport;
    }

    public List<String> getClosure() {
        return closure;
    }

    public void setClosure(List<String> closure) {
        this.closure = closure;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public List<String> getSurface() {
        return surface;
    }

    public void setSurface(List<String> surface) {
        this.surface = surface;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSizePage() {
        return sizePage;
    }

    public void setSizePage(String sizePage) {
        this.sizePage = sizePage;
    }

    public List<String> getSportSub() {
        return sportSub;
    }

    public void setSportSub(List<String> sportSub) {
        this.sportSub = sportSub;
    }

    public List<String> getProductfit() {
        return productfit;
    }

    public void setProductfit(List<String> productfit) {
        this.productfit = productfit;
    }
}
