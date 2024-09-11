package com.srss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.srss.entity.RawatJalan;
import com.srss.repository.RawatJalanRepository;

public class RawatJalanServiceImpl implements RawatJalanService{
	
	@Autowired
	private RawatJalanRepository rawatJalanRepository;

	@Override
	public List<RawatJalan> getAllRawatJalan() {
		return rawatJalanRepository.findAll();
	}

	@Override
	public RawatJalan saveRawatJalan(RawatJalan rawatJalan) {
		return rawatJalanRepository.save(rawatJalan);
	}

	@Override
	public RawatJalan getRawatJalanById(Long id) {
		return rawatJalanRepository.findById(id).get();
	}

	@Override
	public RawatJalan updateRawatJalan(RawatJalan rawatJalan) {
		return rawatJalanRepository.save(rawatJalan);
	}

	@Override
	public void deleteRawatJalanById(Long id) {
		rawatJalanRepository.deleteById(id);
	}

}
