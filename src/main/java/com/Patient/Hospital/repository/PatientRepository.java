package com.Patient.Hospital.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Patient.Hospital.entity.Patientinof;

@Repository
public interface PatientRepository extends JpaRepository<Patientinof, UUID> {

}
