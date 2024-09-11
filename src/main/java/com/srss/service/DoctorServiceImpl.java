package com.srss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srss.entity.Dokter;
import com.srss.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorRepository doctorRepository;

	
	@Override
	public List<Dokter> getAllDoctor() {
		return doctorRepository.findAll();
	}

	@Override
	public Dokter saveDoctor(Dokter dokter) {
		return doctorRepository.save(dokter);
	}

	@Override
	public Dokter getDoctorById(Long id) {
		return doctorRepository.findById(id).get();
	}

	@Override
	public Dokter updateDoctor(Dokter dokter) {
		return doctorRepository.save(dokter);
	}


	@Override
	public void deleteDoctorById(Long id) {
		doctorRepository.deleteById(id);
	}

}
