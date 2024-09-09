package com.srss.service;

import java.util.List;

import com.srss.entity.Dokter;


public interface DoctorService {

	List<Dokter> getAllDoctor();

	Dokter saveDoctor(Dokter student);

	Dokter getDoctorById(Long id);

	Dokter updateDoctor(Dokter student);

	void deleteDoctorById(Long id);
}
