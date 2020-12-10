package com.sulabh.pms.dao;

import com.sulabh.pms.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDao extends JpaRepository<Patient, Long> {

}
