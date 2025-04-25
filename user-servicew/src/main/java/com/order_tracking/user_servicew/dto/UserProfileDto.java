package com.order_tracking.user_servicew.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserProfileDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int age;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
