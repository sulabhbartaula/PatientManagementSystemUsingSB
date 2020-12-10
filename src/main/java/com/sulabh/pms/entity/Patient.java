package com.sulabh.pms.entity;

public class Patient {

    private long patientId;
    private String patientName;
    private String description;
    //private String xrayImageUrl;

    public Patient(){

    }

    public Patient(long patientId, String patientName, String description) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.description = description;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
