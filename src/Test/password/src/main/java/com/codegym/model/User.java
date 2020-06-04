package com.codegym.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class User  implements Validator {
    private String name;
    private String password;
    private String password2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        String password2 = user.getPassword2();
        String password = user.getPassword();
        ValidationUtils.rejectIfEmpty(errors, "password2","", "Không được để trống");
        if (!password2.equals(password)){
            errors.rejectValue("password2","","Pass không trùng" );
        }
    }
}
