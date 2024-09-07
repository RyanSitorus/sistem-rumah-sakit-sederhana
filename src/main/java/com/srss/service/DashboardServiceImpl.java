package com.srss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srss.entity.Patient;
import com.srss.repository.DashboardRepository;

@Service
public class DashboardServiceImpl implements DashboardService{

	@Autowired
	private DashboardRepository dashboardRepository;

	
	@Override
	public List<Patient> getAllPatient() {
		return dashboardRepository.findAll();
	}

}
