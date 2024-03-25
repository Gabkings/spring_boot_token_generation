package com.example.spring_jwt_tutorial.users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserReposity extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
