package com.auca.vet_patient_manager.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;
@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID appointmentID = UUID.randomUUID();
    private Date appointmentDate;
    private Time appointmentTime;
    private String appointmentDescription;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patientId;
    @OneToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointmentId;

    public Appointment() {
    }

    public Appointment(UUID appointmentID, Date appointmentDate, Time appointmentTime, String appointmentDescription, Patient patientId) {
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.appointmentDescription = appointmentDescription;
        this.patientId = patientId;
    }

    public UUID getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(UUID appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Time getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Time appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        this.appointmentDescription = appointmentDescription;
    }

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }
}
