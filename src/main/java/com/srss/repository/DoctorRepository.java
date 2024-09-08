package com.srss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srss.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
