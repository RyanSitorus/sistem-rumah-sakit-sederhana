package com.srss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srss.entity.RawatJalan;

@Repository
public interface RawatJalanRepository extends JpaRepository<RawatJalan, Long>{


}
