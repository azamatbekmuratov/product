package com.bekmuratov.product.domain.dto.general;

public class SuccessOperation {
    public String code;
    public String message;
    public SuccessOperation(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
