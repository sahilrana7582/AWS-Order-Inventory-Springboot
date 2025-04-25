package com.order_tracking.user_servicew.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    private String username;
    private String password;
    private UserProfileDto profile;
}
