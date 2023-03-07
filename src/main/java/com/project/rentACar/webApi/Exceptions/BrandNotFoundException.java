package com.project.rentACar.webApi.Exceptions;

public class BrandNotFoundException extends RuntimeException {
    public BrandNotFoundException(String msg){
        super(msg);
    }
}
