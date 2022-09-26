package com.bekmuratov.product.exception;

public class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException() {
        super(String.format("Internal Server Error"));
    }
}