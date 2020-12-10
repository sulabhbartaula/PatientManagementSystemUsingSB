package com.sulabh.pms.service;

import com.sulabh.pms.dao.PatientDao;
import com.sulabh.pms.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDao;

    public PatientServiceImpl(){}

    @Override
    public List<Patient> getAllPatients() {
        return patientDao.findAll();
    }

    @Override
    public Patient getPatient(long patientId) {
        System.out.println("BEfore execution");
        System.out.println(patientDao.getOne(patientId));
        return patientDao.findById(patientId).get();
    }

    @Override
    public Patient addPatient(Patient patient) {
        return patientDao.save(patient);
    }

    @Override
    public Patient updateCourse(Patient patient) {

        return patientDao.save(patient);
    }

    @Override
    public void deletePatient(long patientId) {

        Patient entity = patientDao.getOne(patientId);
        System.out.println(entity);
        patientDao.delete(entity);
    }

}
