package com.order_tracking.user_servicew.service;

import com.order_tracking.user_servicew.dto.UserDto;
import com.order_tracking.user_servicew.entities.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto dto);
    UserDto getUserById(String id);
    List<UserDto> getAllUsers();
    UserDto updateUser(String id, UserDto dto);
    void deleteUser(String id);
}
