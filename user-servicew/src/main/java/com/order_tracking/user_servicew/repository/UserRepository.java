package com.order_tracking.user_servicew.repository;

import com.order_tracking.user_servicew.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findByUsername(String username);
}
