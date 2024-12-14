package com.auca.vet_patient_manager.model;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
public class MedicalRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID medicalRecordId = UUID.randomUUID();
    private String treatmentDetails;
    private String diagnosis;
    private String prescription;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patientId;

    public MedicalRecords() {
    }

    public MedicalRecords(UUID medicalRecordId, String treatmentDetails, String diagnosis, String prescription, Patient patientId) {
        this.medicalRecordId = medicalRecordId;
        this.treatmentDetails = treatmentDetails;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.patientId = patientId;
    }

    public UUID getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(UUID medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }
}
