package com.srss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srss.entity.Dokter;

@Repository
public interface DoctorRepository extends JpaRepository<Dokter, Long> {

}
