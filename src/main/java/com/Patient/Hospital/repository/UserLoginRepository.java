package com.Patient.Hospital.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Patient.Hospital.entity.UserLogin;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, UUID> {

}
