package com.srss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srss.entity.Doctor;
import com.srss.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorRepository doctorRepository;

	
	@Override
	public List<Doctor> getAllDoctor() {
		return doctorRepository.findAll();
	}

	@Override
	public Doctor saveDoctor(Doctor patient) {
		return doctorRepository.save(patient);
	}

	@Override
	public Doctor getDoctorById(Long id) {
		return doctorRepository.findById(id).get();
	}

	@Override
	public Doctor updateDoctor(Doctor patient) {
		return doctorRepository.save(patient);
	}


	@Override
	public void deleteDoctorById(Long id) {
		doctorRepository.deleteById(id);
	}

}
