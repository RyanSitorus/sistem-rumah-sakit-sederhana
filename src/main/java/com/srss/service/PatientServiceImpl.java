package com.srss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srss.entity.Pasien;
import com.srss.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository patientRepository;

	
	@Override
	public List<Pasien> getAllPatient() {
		return patientRepository.findAll();
	}

	@Override
	public Pasien savePatient(Pasien pasien) {
		return patientRepository.save(pasien);
	}


	@Override
	public Pasien getPatientById(Long id) {
		return patientRepository.findById(id).get();
	}

	@Override
	public Pasien updatePatient(Pasien pasien) {
		return patientRepository.save(pasien);
	}


	@Override
	public void deletePatientById(Long id) {
		patientRepository.deleteById(id);
	}

}
