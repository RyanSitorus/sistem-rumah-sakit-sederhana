package com.srss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.srss.entity.RawatInap;
import com.srss.repository.RawatInapRepository;

public class RawatInapServiceImpl implements RawatInapService{

	@Autowired
	private RawatInapRepository rawatInapRepository;

	@Override
	public List<RawatInap> getAllRawatInap() {
		return rawatInapRepository.findAll();
	}

	@Override
	public RawatInap saveRawatInap(RawatInap rawatInap) {
		return rawatInapRepository.save(rawatInap);
	}

	@Override
	public RawatInap getRawatInapById(Long id) {
		return rawatInapRepository.findById(id).get();
	}

	@Override
	public RawatInap updateRawatInap(RawatInap rawatInap) {
		return rawatInapRepository.save(rawatInap);
	}

	@Override
	public void deleteRawatInapById(Long id) {
		rawatInapRepository.deleteById(id);
	}

}
