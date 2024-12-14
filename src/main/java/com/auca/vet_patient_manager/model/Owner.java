package com.auca.vet_patient_manager.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "owners")
public class  Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ownerId = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;

    public Owner() {
    }

    public Owner(UUID ownerId, String firstName, String lastName, String phoneNumber, String email, String address) {
        this.ownerId = ownerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public UUID getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
