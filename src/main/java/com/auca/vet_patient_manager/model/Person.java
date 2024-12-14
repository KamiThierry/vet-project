package com.auca.vet_patient_manager.model;

import jakarta.persistence.*;

import java.util.UUID;

@MappedSuperclass
public abstract class Person {

    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private EGender gender;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String firstName, String lastName, EGender gender, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public EGender getGender() {
        return gender;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
