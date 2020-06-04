package com.codegym.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

public class User {
    @Length(min = 5,max = 45)
    private String firstName;
    @Length(min = 5,max = 45)
    private String lastName;
    @Min(5)
    private String age;
    @Pattern(regexp = "^\\w+@\\w{3,10}.\\w+")
    private String email;
    @Pattern(regexp = "^\\d{10}",message = "must be 10 number")
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
