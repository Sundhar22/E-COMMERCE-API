package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.User;

/**
 * UserRepository
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    
}