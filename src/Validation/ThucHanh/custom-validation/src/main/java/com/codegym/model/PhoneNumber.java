package com.codegym.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.lang.annotation.Annotation;

@Component
public class PhoneNumber implements Valid {

    @NotEmpty
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}