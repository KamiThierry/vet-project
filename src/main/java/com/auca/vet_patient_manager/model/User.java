package com.auca.vet_patient_manager.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class User extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID user_id = UUID.randomUUID();
    private String userName;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User() {
    }

    public User(String firstName, String lastName, EGender gender, int phoneNumber, String email, UUID user_id, String userName, String password, Role role) {
        super(firstName, lastName, gender, phoneNumber, email);
        this.user_id = user_id;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
