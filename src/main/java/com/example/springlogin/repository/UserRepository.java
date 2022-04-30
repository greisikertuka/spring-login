package com.example.springlogin.repository;

import java.util.Optional;

import com.example.springlogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findUserByUsername(String username);
}
