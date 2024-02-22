package com.xjudge.repository;

import com.xjudge.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User , Long> {
    Optional<User> findUserByUserHandle(String userHandle);
    Optional<User> findUserByUserEmail(String userEmail);
    boolean existsByUserHandle(String userHandle);
    boolean existsByUserEmail(String userEmail);
}
