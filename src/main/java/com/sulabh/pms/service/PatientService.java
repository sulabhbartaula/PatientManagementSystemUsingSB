package com.sulabh.pms.service;

import com.sulabh.pms.entity.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PatientService {

    public List<Patient> getAllPatients();
    public Patient getPatient(long courseId);
    public Patient addPatient(Patient patient);
    public Patient updateCourse(Patient patient);
    public void deletePatient(long patientId);
}
