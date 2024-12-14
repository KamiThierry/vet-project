package com.auca.vet_patient_manager.controller;


import com.auca.vet_patient_manager.model.Owner;
import com.auca.vet_patient_manager.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/owners", produces = MediaType.APPLICATION_JSON_VALUE)
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<?> createOwner(@RequestBody Owner owner) {
        try {
            Owner savedOwner = ownerService.saveOwner(owner);
            return new ResponseEntity<>(savedOwner, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
        @GetMapping
        public ResponseEntity<List<Owner>> getAllOwners() {
        List<Owner> owners = ownerService.getAllOwner();
        return new ResponseEntity<>(owners, HttpStatus.OK);

        }
        @GetMapping("/{id}")
    public ResponseEntity<Owner> getOwnerById(@PathVariable("id") UUID id) {
        Owner owner = ownerService.getOwnerById(id);
        return new ResponseEntity<>(owner, HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<List<Owner>> getOwnerByName(@RequestParam String name) {
        List<Owner> owners = ownerService.getOwnerByName(name);
        if (owners.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(owners, HttpStatus.OK);
        }
    }
@DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOwner(@PathVariable("id") UUID id) {
        ownerService.deleteOwnerById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
}
