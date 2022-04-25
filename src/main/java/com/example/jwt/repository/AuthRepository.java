package com.example.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jwt.models.AdminDetails;

@Repository
public interface AuthRepository extends JpaRepository<AdminDetails, Long>{

}
