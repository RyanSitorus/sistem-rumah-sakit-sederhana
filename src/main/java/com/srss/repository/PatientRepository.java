package com.srss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srss.entity.Pasien;

@Repository
public interface PatientRepository extends JpaRepository<Pasien, Long> {

}
