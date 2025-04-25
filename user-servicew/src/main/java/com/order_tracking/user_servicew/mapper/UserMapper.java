package com.order_tracking.user_servicew.mapper;


import com.order_tracking.user_servicew.dto.UserDto;
import com.order_tracking.user_servicew.dto.UserProfileDto;
import com.order_tracking.user_servicew.entities.User;
import com.order_tracking.user_servicew.entities.UserProfile;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto mapToDto(User user) {
        return UserDto.builder()
                .username(user.getUsername())
                .profile(user.getUserProfile() == null ? null : UserProfileDto.builder()
                        .firstName(user.getUserProfile().getFirstName())
                        .lastName(user.getUserProfile().getLastName())
                        .email(user.getUserProfile().getEmail())
                        .phoneNumber(user.getUserProfile().getPhoneNumber())
                        .age(user.getUserProfile().getAge())
                        .address(user.getUserProfile().getAddress())
                        .city(user.getUserProfile().getCity())
                        .state(user.getUserProfile().getState())
                        .country(user.getUserProfile().getCountry())
                        .zipCode(user.getUserProfile().getZipCode())
                        .build())
                .build();
    }

    public User mapToEntity(UserDto userDto) {
        return User.builder()
                .username(userDto.getUsername())
                .userProfile(userDto.getProfile() == null ? null : UserProfile.builder()
                        .firstName(userDto.getProfile().getFirstName())
                        .lastName(userDto.getProfile().getLastName())
                        .email(userDto.getProfile().getEmail())
                        .phoneNumber(userDto.getProfile().getPhoneNumber())
                        .age(userDto.getProfile().getAge())
                        .address(userDto.getProfile().getAddress())
                        .city(userDto.getProfile().getCity())
                        .state(userDto.getProfile().getState())
                        .country(userDto.getProfile().getCountry())
                        .zipCode(userDto.getProfile().getZipCode())
                        .build())
                .build();
    }
}
