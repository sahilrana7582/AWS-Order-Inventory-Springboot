package com.order_tracking.user_servicew.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

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

    @OneToOne(mappedBy = "userProfile", fetch = FetchType.LAZY)
    private User user;

}
