package com.srss.service;

import java.util.List;

import com.srss.entity.RawatJalan;

public interface RawatJalanService {
	List<RawatJalan> getAllRawatJalan();

	RawatJalan saveRawatJalan(RawatJalan rawatJalan);

	RawatJalan getRawatJalanById(Long id);

	RawatJalan updateRawatJalan(RawatJalan rawatJalan);

	void deleteRawatJalanById(Long id);
}
