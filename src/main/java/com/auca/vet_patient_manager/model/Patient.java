package com.auca.vet_patient_manager.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;
@Entity
@Table(name = "Patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID patientId = UUID.randomUUID();
    private String name;
    @Enumerated(EnumType.STRING)
    private EGender gender;
    @Enumerated(EnumType.STRING)
    private Species species;
    private Date dateOfBirth;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Patient() {
    }

    public Patient(UUID patientId, String name, EGender gender, Species species, Date dateOfBirth, Owner owner) {
        this.patientId = patientId;
        this.name = name;
        this.gender = gender;
        this.species = species;
        this.dateOfBirth = dateOfBirth;
        this.owner = owner;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EGender getGender() {
        return gender;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
