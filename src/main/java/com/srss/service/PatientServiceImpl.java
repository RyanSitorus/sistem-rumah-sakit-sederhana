package com.srss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srss.entity.Patient;
import com.srss.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository patientRepository;

	
	@Override
	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
	}

	@Override
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}


	@Override
	public Patient getPatientById(Long id) {
		return patientRepository.findById(id).get();
	}

	@Override
	public Patient updatePatient(Patient patient) {
		return patientRepository.save(patient);
	}


	@Override
	public void deletePatientById(Long id) {
		patientRepository.deleteById(id);
	}

}
