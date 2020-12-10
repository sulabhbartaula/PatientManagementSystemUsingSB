package com.sulabh.pms.service;

import com.sulabh.pms.entity.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    List<Patient> patients;

    public PatientServiceImpl(){
        patients = new ArrayList<>();

        patients.add(new Patient(1,"Sanjay","Diabetic"));
        patients.add(new Patient(2,"Binay","Needs Antibiotics"));
        patients.add(new Patient(3,"Charles","Fever"));
    }

    @Override
    public List<Patient> getAllPatients() {
        return patients;
    }

    @Override
    public Patient getPatient(long patientId) {

        Patient patient = null;

        for(Patient p : patients){
            if(p.getPatientId() == patientId){
                patient = p;
                break;
            }
        }
        return patient;
    }

    @Override
    public Patient addPatient(Patient patient) {

        patients.add(patient);
        return patient;
    }

    @Override
    public Patient updateCourse(Patient patient) {

        for(Patient p : patients){
            if(p.getPatientId() == patient.getPatientId()){
                p.setPatientName(patient.getPatientName());
                p.setDescription(patient.getDescription());
            }
        }
        return patient;
    }

    @Override
    public void deletePatient(long patientId) {
        int index = -1;

        for(Patient p : patients){
            if(p.getPatientId() == patientId){
                index = patients.indexOf(p);
                break;
            }
        }
        patients.remove(index);
    }

}
