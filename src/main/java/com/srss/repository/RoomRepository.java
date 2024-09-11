package com.srss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srss.entity.Ruangan;

@Repository
public interface RoomRepository extends JpaRepository<Ruangan, Long> {

}
