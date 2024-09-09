package com.srss.service;

import java.util.List;

import com.srss.entity.Pasien;


public interface PatientService {

	List<Pasien> getAllPatient();
	
	Pasien savePatient(Pasien student);

	Pasien getPatientById(Long id);

	Pasien updatePatient(Pasien student);

	void deletePatientById(Long id);
}
