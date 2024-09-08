package com.srss.service;

import java.util.List;

import com.srss.entity.Doctor;


public interface DoctorService {

	List<Doctor> getAllDoctor();

	Doctor saveDoctor(Doctor student);

	Doctor getDoctorById(Long id);

	Doctor updateDoctor(Doctor student);

	void deleteDoctorById(Long id);
}
