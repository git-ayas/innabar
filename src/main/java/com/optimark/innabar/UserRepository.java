package com.optimark.innabar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.optimark.innabar.model.UserAuthRecords;


public interface UserRepository extends JpaRepository<UserAuthRecords, Long> {
    UserAuthRecords findByUsername(String username);
}
