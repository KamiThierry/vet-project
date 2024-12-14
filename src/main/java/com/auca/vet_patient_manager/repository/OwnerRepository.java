package com.auca.vet_patient_manager.repository;

import com.auca.vet_patient_manager.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, UUID> {


    List<Owner> findByFirstNameContaining(String firstName);
}
