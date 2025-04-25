package com.order_tracking.user_servicew.repository;

import com.order_tracking.user_servicew.entities.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, String> {
}
