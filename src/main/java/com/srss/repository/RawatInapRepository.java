package com.srss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srss.entity.RawatInap;
import com.srss.entity.Ruangan;

@Repository
public interface RawatInapRepository extends JpaRepository<RawatInap, Long> {

}
