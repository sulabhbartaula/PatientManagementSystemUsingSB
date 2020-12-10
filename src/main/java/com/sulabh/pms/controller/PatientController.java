package com.sulabh.pms.controller;

import com.sulabh.pms.entity.Patient;
import com.sulabh.pms.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public List<Patient> getAllPatients(){

        return this.patientService.getAllPatients();
    }

    @GetMapping("/patients/{patientId}")
    public Patient getPatient(@PathVariable String patientId){
        return this.patientService.getPatient(Long.parseLong(patientId));
    }

    @PostMapping("/patients")
    public Patient addPatient(@RequestBody Patient patient){

        return this.patientService.addPatient(patient);

    }

    @PutMapping("/patients")
    public Patient updatePatient(@RequestBody Patient patient){
        return this.patientService.updateCourse(patient);
    }

    @DeleteMapping("/patients/{patientId}")
    public ResponseEntity<HttpStatus> deletePatient(@PathVariable String patientId){

        try{
            this.patientService.deletePatient(Long.parseLong(patientId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
