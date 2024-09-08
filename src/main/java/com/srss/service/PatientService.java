package com.srss.service;

import java.util.List;

import com.srss.entity.Patient;


public interface PatientService {

	List<Patient> getAllPatient();
	
	Patient savePatient(Patient student);

	Patient getPatientById(Long id);

	Patient updatePatient(Patient student);

	void deletePatientById(Long id);
}
