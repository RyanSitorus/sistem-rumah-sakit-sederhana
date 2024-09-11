package com.srss.service;

import java.util.List;

import com.srss.entity.RawatInap;

public interface RawatInapService {
	List<RawatInap> getAllRawatInap();

	RawatInap saveRawatInap(RawatInap rawatInap);

	RawatInap getRawatInapById(Long id);

	RawatInap updateRawatInap(RawatInap rawatInap);

	void deleteRawatInapById(Long id);
}
