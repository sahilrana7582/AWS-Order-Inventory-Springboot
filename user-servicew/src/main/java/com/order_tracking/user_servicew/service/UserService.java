package com.order_tracking.user_servicew.service;

import com.order_tracking.user_servicew.entities.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

    User createUser(String username, String password);
    User getUser(String username);

}
