package com.srss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srss.entity.Patient;

public interface DashboardRepository extends JpaRepository<Patient, Long> {

}
