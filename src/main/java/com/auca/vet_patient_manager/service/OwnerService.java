package com.auca.vet_patient_manager.service;

import com.auca.vet_patient_manager.model.Owner;
import com.auca.vet_patient_manager.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;
    public List<Owner> getAllOwner() {
        return ownerRepository.findAll();
    }
    public Owner getOwnerById(UUID id) {
        return ownerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Owner not found"));
    }
    public Owner saveOwner(Owner owner) {
        if (owner.getOwnerId() != null && ownerRepository.existsById(owner.getOwnerId())) {
            throw new IllegalArgumentException("Owner with this ID already exists.");
        }
        // If the ID is null, it assumes a new entity is being created.
        return ownerRepository.save(owner);
    }


    public void deleteOwnerById(UUID id) {
        ownerRepository.deleteById(id);
    }

    public List<Owner> getOwnerByName(String name) {
        return ownerRepository.findByFirstNameContaining(name);
    }
}

