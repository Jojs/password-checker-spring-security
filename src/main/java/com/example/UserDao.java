package com.example;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, UUID> {}
